package com.dcjt.wps.modules.centerplatform.controller;

import com.dcjt.wps.modules.centerplatform.domain.RestResponse;
import com.dcjt.wps.modules.centerplatform.domain.online.preview.GetOnlinePreviewUrlResponse;
import com.dcjt.wps.modules.centerplatform.enums.UrlEnum;
import com.dcjt.wps.modules.common.api.R;
import com.dcjt.wps.modules.common.config.DocsCenterPlatformProperties;
import com.dcjt.wps.modules.common.utils.CommonUtil;
import com.dcjt.wps.modules.common.utils.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.net.URI;

@RestController
@RequestMapping("/online-preview")
public class OnlinePreviewController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DocsCenterPlatformProperties centerPlatformProperties;

    /**
     * 获取预览链接
     * @param fileId 文件ID
     * @return
     */
    @GetMapping("/get-url/{fileId}")
    public R<GetOnlinePreviewUrlResponse> getOnlinePreviewUrl(@PathVariable String fileId) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(centerPlatformProperties.getUrl() + UrlEnum.PREVIEW_URL.getVal());
        builder.queryParam("app_token", TokenUtils.getAppToken().getAppToken());
        builder.queryParam("file_id", fileId);
        builder.queryParam("_w_third_permission", "read");

        URI url = builder.build().toUri();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        GetOnlinePreviewUrlResponse res = restTemplate.exchange(url, HttpMethod.GET, requestEntity, GetOnlinePreviewUrlResponse.class).getBody();
        return R.data(res);
    }

}
