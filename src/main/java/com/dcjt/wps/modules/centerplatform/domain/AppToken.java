package com.dcjt.wps.modules.centerplatform.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 应用token
 *
 * @author yy
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppToken {

    /**
     * 应用凭证
     */
    @JsonProperty("app_token")
    private String appToken;

    /**
     * 有效期
     */
    @JsonProperty("expires_in")
    private long expiresIn;

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

}
