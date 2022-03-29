package com.dcjt.wps.modules.centerplatform.vo;

import java.io.Serializable;

/**
 * 描述信息
 * 在线编辑文件响应类
 *
 * @author yy
 * @date 2021/12/27
 */
public class RespOnlineEditFileVO  implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件ID
     */
    private String fileId;

    /**
     * 文件下载链接
     */
    private String downloadUrl;

    /**
     * 在线编辑url
     */
    private String onlineEditUrl;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getOnlineEditUrl() {
        return onlineEditUrl;
    }

    public void setOnlineEditUrl(String onlineEditUrl) {
        this.onlineEditUrl = onlineEditUrl;
    }
}
