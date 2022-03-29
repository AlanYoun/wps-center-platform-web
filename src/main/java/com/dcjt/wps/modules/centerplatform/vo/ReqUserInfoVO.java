package com.dcjt.wps.modules.centerplatform.vo;

import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

/**
 * 描述信息
 * 用户请求参数
 *
 * @author yy
 * @date 2021/12/27
 */
public class ReqUserInfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 权限 write/read
     */
    private String permission;

    /**
     * 头像地址
     */
    private String avatarUrl;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
