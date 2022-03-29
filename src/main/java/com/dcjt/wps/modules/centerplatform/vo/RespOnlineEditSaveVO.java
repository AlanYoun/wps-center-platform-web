package com.dcjt.wps.modules.centerplatform.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * 描述信息
 * 在线编辑保存文件响应类
 *
 * @author yy
 * @date 2021/12/28
 */
public class RespOnlineEditSaveVO implements Serializable {

    private static final long serialVersionUID = 1L;

    public RespOnlineEditSaveVO() {
        this.file = new File();
    }

    /**
     * 文件对象
     */
    private File file;


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static  class File implements Serializable {

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
         * 文件版本
         */
        private Integer version;

        /**
         * 文件大小
         */
        private Long size;

        /**
         * 文件下载地址
         */
        @JsonProperty("download_url")
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

        public Integer getVersion() {
            return version;
        }

        public void setVersion(Integer version) {
            this.version = version;
        }

        public Long getSize() {
            return size;
        }

        public void setSize(Long size) {
            this.size = size;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }
    }


}
