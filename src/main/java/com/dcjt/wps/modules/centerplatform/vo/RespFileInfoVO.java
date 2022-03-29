package com.dcjt.wps.modules.centerplatform.vo;

import java.io.Serializable;

/**
 * 描述信息
 * 文件信息
 *
 * @author yy
 * @date 2021/9/17
 */
public class RespFileInfoVO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 文件ID
     */
    private String id;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 下载地址
     */
    private String downloadUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
