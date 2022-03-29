package com.dcjt.wps.modules.centerplatform.service;

import com.dcjt.wps.modules.centerplatform.domain.online.edit.GetOnlineEditUrlResponse;
import com.dcjt.wps.modules.centerplatform.enums.UrlEnum;
import com.dcjt.wps.modules.centerplatform.vo.ReqUserInfoVO;
import com.dcjt.wps.modules.common.config.DocsCenterPlatformProperties;
import com.dcjt.wps.modules.common.exception.ServiceException;
import com.dcjt.wps.modules.common.utils.CommonUtil;
import com.dcjt.wps.modules.common.utils.TokenUtils;
import com.dcjt.wps.modules.data.entity.WFile;
import com.dcjt.wps.modules.data.repository.FileRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;
import java.util.Objects;

/**
 * 描述信息
 * 在线编辑业务层
 *
 * @author yy
 * @date 2021/12/27
 */
@Service
public class OnlineEditService {

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DocsCenterPlatformProperties centerPlatformProperties;

    @Resource
    private FileRepository fileRepository;

    /**
     * 获取在线编辑链接
     * @param fileId 文件ID
     * @param user 用户
     * @return
     */
    public GetOnlineEditUrlResponse getUrl(String fileId, ReqUserInfoVO user){
        WFile wFile = fileRepository.findById(fileId).orElse(null);
        if(Objects.isNull(wFile)) {
            throw new ServiceException("文件不存在");
        }
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(centerPlatformProperties.getUrl() + UrlEnum.WEB_OFFICE_URL.getVal());

        builder.queryParam("app_token", TokenUtils.getAppToken().getAppToken());
        builder.queryParam("file_id", fileId);
        builder.queryParam("type", getType(wFile.getName()));
        builder.queryParam("_w_third_user_id", user.getUserId());
        builder.queryParam("_w_third_user_name", user.getUserName());
        builder.queryParam("_w_third_permission", user.getPermission());
        builder.queryParam("_w_third_avatar_url", user.getAvatarUrl());

        URI url = builder.build().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        GetOnlineEditUrlResponse res = restTemplate.exchange(url, HttpMethod.GET, requestEntity, GetOnlineEditUrlResponse.class).getBody();
        return res;
    }

    /**
     * 根据文件名称获取wos文件类型（文字文件:w, 表格文件:s, 演示文件:p, PDF文件:f）
     * @param fileName 文件名称
     * @return
     */
    private String getType(String fileName){
        String suffix = CommonUtil.fileSuffix(fileName);
        if(suffix.indexOf("doc") != -1) {
            return "w";
        }
        if(suffix.indexOf("xls") != -1) {
            return "s";
        }
        if(suffix.indexOf("ppt") != -1) {
            return "p";
        }
        return "f";
    }
}
