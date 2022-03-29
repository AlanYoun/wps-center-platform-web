package com.dcjt.wps.modules.centerplatform.controller;

import com.dcjt.wps.modules.centerplatform.domain.online.edit.*;
import com.dcjt.wps.modules.centerplatform.service.FileService;
import com.dcjt.wps.modules.centerplatform.vo.ReqUserInfoVO;
import com.dcjt.wps.modules.centerplatform.vo.RespOnlineEditSaveVO;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 描述信息
 * 在线编辑回调控制器
 *
 * @author yy
 * @date 2021/12/22
 */
@RestController
@RequestMapping("/v1/3rd/file")
public class OnlineEditCallBackController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @Resource
    private FileService fileService;

    /**
     * 查询用户信息
     * @param appId 应用ID
     * @param fileId 文件ID
     * @param userId     用户ID
     * @param userName   用户名称
     * @param permission 权限 write/read
     * @param avatarUrl 头像路径
     * @return
     */
    @GetMapping("/info")
    public GetFileResponse info(
            @RequestParam("_w_third_appid") String appId,
            @RequestParam("_w_third_file_id") String fileId,
            @RequestParam(name = "_w_third_user_id", required = false) String userId,
            @RequestParam(name = "_w_third_user_name", required = false) String userName,
            @RequestParam(name = "_w_third_permission", defaultValue = "write") String permission,
            @RequestParam(name = "_w_third_avatar_url", required = false) String avatarUrl) {
        GetFileResponse.User user = new GetFileResponse.User();
        user.setId(userId);
        user.setName(userName);
        user.setPermission(permission);
        user.setAvatarUrl(avatarUrl);
        return fileService.info(appId, fileId, user);
    }

    /**
     * 保存文件
     *
     * @param file   文件
     * @param fileId 文件ID
     * @param appId  应用ID
     * @param userId 用户ID
     * @return
     */
    @PostMapping("/save")
    public SaveFileResponse fileSave(@RequestBody MultipartFile file,
                                     @RequestParam("_w_third_appid") String appId,
                                     @RequestParam("_w_third_file_id") String fileId,
                                     @RequestParam(name = "_w_third_user_id") String userId) {
        return fileService.save(file,fileId, appId, userId);
    }

    /**
     * 文件历史记录
     * @param appId 应用ID
     * @param fileId 文件ID
     * @return
     */
    @PostMapping("/history")
    public GetFileVersionsResponse history(@RequestParam("_w_third_appid") String appId,
                                           @RequestParam("_w_third_file_id") String fileId,
                                           @RequestParam(name = "_w_third_user_id") String userId,
                                           @RequestParam(name = "_w_third_user_name") String userName,
                                           @RequestParam(name = "_w_third_avatar_url") String avatarUrl){
        return fileService.history(fileId, userId, userName, avatarUrl);
    }

    /**
     * 获取特定版本的文件信息
     * @param appId 应用ID
     * @param fileId 文件ID
     * @return
     */
    @GetMapping("/version/{version}")
    public GetFileVersionResponse getFileByVersion(@PathVariable String version,
                                                   @RequestParam("_w_third_appid") String appId,
                                                   @RequestParam("_w_third_file_id") String fileId) {
        return fileService.version(fileId);
    }


}
