package com.dcjt.wps.modules.centerplatform.service;

import com.dcjt.wps.modules.centerplatform.domain.online.edit.*;
import com.dcjt.wps.modules.centerplatform.vo.ReqUserInfoVO;
import com.dcjt.wps.modules.centerplatform.vo.RespOnlineEditFileVO;
import com.dcjt.wps.modules.centerplatform.vo.RespOnlineEditSaveVO;
import com.dcjt.wps.modules.common.exception.ServiceException;
import com.dcjt.wps.modules.common.utils.CommonUtil;
import com.dcjt.wps.modules.data.entity.WFile;
import com.dcjt.wps.modules.data.repository.FileRepository;
import com.dcjt.wps.modules.minio.domain.MinioFile;
import com.dcjt.wps.modules.minio.props.MinioProperties;
import com.dcjt.wps.modules.minio.service.MinioService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.*;

/**
 * 描述信息
 *
 * @author 杨祎
 * @date 2020/9/28
 */
@Service
public class FileService {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private MinioProperties minioProperties;

    @Resource
    private MinioService minioService;

    @Resource
    private FileRepository fileRepository;

    @Resource
    private OnlineEditService onlineEditService;

    /**
     * 查询文件信息
     *
     * @param user 用户
     * @return
     */
    public GetFileResponse info(String appId, String fileId, GetFileResponse.User user) {
        GetFileResponse response = new GetFileResponse();
        response.setUser(user);
        //组装
        WFile wFile = fileRepository.findById(fileId).get();
        GetFileResponse.File file = new GetFileResponse.File();
        BeanUtils.copyProperties(wFile, file);
        response.setFile(file);
        return response;
    }

    /**
     * 保存文件
     *
     * @param mFile  文件对象
     * @param userId 用户ID
     * @return
     */
    public SaveFileResponse save(MultipartFile mFile, String fileId, String appId, String userId) {
        WFile wFile = fileRepository.findById(fileId).orElse(null);
        if (Objects.isNull(wFile)) {
            return null;
        }

        //上传文件
        MinioFile minioFile = minioService.upload(minioProperties.getBucketName(), mFile, wFile.getName());
        //保存至数据库
        wFile.setSize(minioFile.getSize());
        wFile.setModifier(userId);
        wFile.setModifyTime(System.currentTimeMillis());
        fileRepository.saveAndFlush(wFile);
        log.info("save file, id:{}", fileId);

        SaveFileResponse response = new SaveFileResponse();
        SaveFileResponse.File file = response.getFile();
        file.setId(fileId);
        file.setSize(wFile.getSize());
        file.setName(wFile.getName());
        //目前所有文件都只有一个版本
        file.setVersion(1);
        file.setDownloadUrl(wFile.getDownloadUrl());
        return response;
    }

    /**
     * 新建文件
     *
     * @param mFile 文件
     * @param user  用户信息
     * @return
     */
    public RespOnlineEditFileVO fileNew(MultipartFile mFile, ReqUserInfoVO user) {
        MinioFile minioFile = minioService.upload(minioProperties.getBucketName(), mFile);
        return fileSave(minioFile, user);
    }

    /**
     * 保存文件
     *
     * @param user
     * @param minioFile
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public RespOnlineEditFileVO fileSave(MinioFile minioFile, ReqUserInfoVO user) {

        WFile wFile = new WFile();
        wFile.setName(minioFile.getName());
        wFile.setSize(minioFile.getSize());
        wFile.setCreator(user.getUserId());
        wFile.setModifier(user.getUserId());
        wFile.setCreateTime(System.currentTimeMillis());
        wFile.setModifyTime(System.currentTimeMillis());
        wFile.setDownloadUrl(minioProperties.getNetEndpoint() + "/" + minioFile.getBucketName() + "/" + minioFile.getName());
        fileRepository.save(wFile);
        log.info("new file,id:{}", wFile.getId());

        RespOnlineEditFileVO fileVO = new RespOnlineEditFileVO();
        fileVO.setFileId(wFile.getId());
        fileVO.setDownloadUrl(wFile.getDownloadUrl());
        CommonUtil.fileSuffix(wFile.getName());
        GetOnlineEditUrlResponse res = onlineEditService.getUrl(wFile.getId(), user);
        if(Objects.isNull(res)) {
            throw new ServiceException("获取在线编辑链接失败！");
        }
        fileVO.setOnlineEditUrl(res.getUrl());
        return fileVO;
    }

    /**
     * 查询文件历史版本
     * @param fileId 文件ID
     * @param userId 用户ID
     * @param userName 用户名称
     * @param avatarUrl 用户头像
     * @return
     */
    public GetFileVersionsResponse history(String fileId, String userId, String userName, String avatarUrl){
        GetFileVersionsResponse response = new GetFileVersionsResponse();
        WFile wFile = fileRepository.findById(fileId).orElse(null);
        if(Objects.isNull(wFile)) {
            log.warn("file id:{} does not exist", fileId);
           return response;
        }

        GetFileVersionsResponse.File file = new GetFileVersionsResponse.File();
        BeanUtils.copyProperties(wFile, file);
        file.setVersion(1);
        GetFileVersionsResponse.File.User user = new GetFileVersionsResponse.File.User();
        user.setId(userId);
        user.setName(userName);
        user.setAvatarUrl(avatarUrl);
//        file.setCreator(user);
        file.setModifier(user);
        response.setFiles(Arrays.asList(file));
    return response;
    }

    public GetFileVersionResponse version(String fileId) {
        GetFileVersionResponse response = new GetFileVersionResponse();
        WFile wFile = fileRepository.findById(fileId).orElse(null);
        if(Objects.isNull(wFile)) {
            log.warn("file id:{} does not exist", fileId);
            return response;
        }

        GetFileVersionResponse.File file = new GetFileVersionResponse.File();
        BeanUtils.copyProperties(wFile, file);
        file.setVersion(1);
        response.setFile(file);
        return response;
    }

    /**
     * 复制wps文件
     *
     * @param fileId 文件编号
     * @param user   用户ID
     * @return
     */
    public RespOnlineEditFileVO fileCopy(String fileId, ReqUserInfoVO user) {
        WFile oldFile = fileRepository.findById(fileId).orElse(null);
        if (Objects.isNull(oldFile)) {
            return null;
        }
        MinioFile minioFile = minioService.coypFile(minioProperties.getBucketName(), oldFile.getName());
        minioFile.setSize(oldFile.getSize());
        return fileSave(minioFile, user);
    }

//
    /**
     * 获取文件信息
     *
     * @param id ID
     * @return
     */
    public WFile getWFile(String id) {
        return fileRepository.findById(id).orElse(null);
    }

    /**
     * 删除文件
     *
     * @param id 文件ID
     * @return
     */
    public boolean remove(String id) {
        WFile wFile = fileRepository.findById(id).orElse(null);
        if(Objects.isNull(wFile)) {
            log.warn("file id:{} does not exist", id);
           return false;
        }
        fileRepository.deleteById(id);
        return minioService.remove(minioProperties.getBucketName(), wFile.getName());
    }

}
