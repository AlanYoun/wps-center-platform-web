package com.dcjt.wps.modules.centerplatform.vo;

/**
 * 描述信息
 *  拷贝文件-请求类
 *
 * @author yy
 * @date 2021/12/28
 */

public class ReqCopyFileVO extends ReqUserInfoVO{

    private static final long serialVersionUID = 1L;

    /**
     * 文件ID
     */
    String fileId;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
