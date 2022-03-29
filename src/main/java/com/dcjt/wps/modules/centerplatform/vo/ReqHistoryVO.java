package com.dcjt.wps.modules.centerplatform.vo;

/**
 * 描述信息
 * 获取在线编辑链接-请求类
 *
 * @author yy
 * @date 2021/12/27
 */

public class ReqHistoryVO extends ReqUserInfoVO{

    private static final long serialVersionUID = 1L;

    /**
     * 文件ID
     */
    String fileId;

    /**
     * 文件格式（文字文件:w, 表格文件:s, 演示文件:p, PDF文件:f）
     */
    String type = "w";

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
