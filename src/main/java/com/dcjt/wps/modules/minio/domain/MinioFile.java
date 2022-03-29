package com.dcjt.wps.modules.minio.domain;

import java.io.Serializable;

/**
 * 描述信息
 * minio 文件实体类
 *
 * @author 杨祎
 * @date 2020/10/10
 */
public class MinioFile implements Serializable {

    /**
     * 文件名称
     */
    private String name;

    /**
     * 原始名称
     */
    private String orgName;

    /**
     * 存储桶名称
     */
    private String bucketName;

    /**
     * 文件大小
     */
    private Long size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }
}
