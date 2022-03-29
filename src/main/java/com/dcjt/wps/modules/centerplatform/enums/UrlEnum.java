package com.dcjt.wps.modules.centerplatform.enums;

/**
 * 描述信息
 *
 * @author yy
 * @date 2021/12/22
 */
public enum UrlEnum {
    //应用获取app_token
    GET_TOKEN("/auth/v1/app/inscope/token"),
    //获取在线编辑链接
    WEB_OFFICE_URL("/weboffice/v1/url"),
    //获取预览链接
    PREVIEW_URL("/preview/v1/url"),

    ;

    private String val;

    UrlEnum(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
