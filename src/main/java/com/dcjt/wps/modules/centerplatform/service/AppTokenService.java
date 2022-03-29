package com.dcjt.wps.modules.centerplatform.service;

import com.dcjt.wps.modules.centerplatform.domain.GeApptTokenResponse;
import com.dcjt.wps.modules.centerplatform.enums.UrlEnum;
import com.dcjt.wps.modules.common.config.DocsCenterPlatformProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * 获取应用token业务层服务
 *
 * @author yy
 * @date 2021/12/22
 */
@Service
public class AppTokenService {

    @Autowired
    private DocsCenterPlatformProperties openPlatformProperties;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 获取应用token
     * @return
     */
    public GeApptTokenResponse getAppToken() {
        URI url = UriComponentsBuilder.fromHttpUrl(openPlatformProperties.getUrl() + UrlEnum.GET_TOKEN.getVal())
                .queryParam("app_id", openPlatformProperties.getAppId())
                .queryParam("scope", openPlatformProperties.getScope()).build().toUri();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>(null, headers);
        GeApptTokenResponse res = restTemplate.exchange(url, HttpMethod.GET, request, GeApptTokenResponse.class).getBody();
        return res;
    }

}
