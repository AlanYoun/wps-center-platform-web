package com.dcjt.wps.modules.data.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * 描述信息
 *
 * @author 杨祎
 * @date 2020/10/10
 */
@Entity
@Table(name = "w_file")
@GenericGenerator(name = "jpa-uuid", strategy = "uuid")
public class WFile {

    @Id
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 版本
     */
    private Integer version = 1;

    /**
     * 长度
     */
    private Long size;

    /**
     * 创建用户
     */
    private String creator;

    /**
     * 修改用户
     */
    private String modifier;

    /**
     * 创建时间
     */
    @Column
    private Long createTime;

    /**
     * 修改时间
     */
    private Long modifyTime;

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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
