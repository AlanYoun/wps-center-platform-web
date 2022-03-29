package com.dcjt.wps.modules.centerplatform.vo;

import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述信息
 * 获取在线编辑链接-请求类
 *
 * @author yy
 * @date 2021/12/27
 */

public class ReqGetOnlineEditUrlVO extends ReqUserInfoVO{

    private static final long serialVersionUID = 1L;

    /**
     * 文件ID
     */
    private String fileId;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
