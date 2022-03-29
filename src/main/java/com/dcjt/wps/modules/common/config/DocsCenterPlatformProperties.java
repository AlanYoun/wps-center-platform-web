package com.dcjt.wps.modules.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix="docs-center-platform")
public class DocsCenterPlatformProperties {

	/**
	 * 应用地址
	 */
	private String url;

	/**
	 * 应用ID
	 */
	private String appId;

	/**
	 * 应用密钥
	 */
    private String appKey;

	/**
	 * 授权作用域
	 * file_preview	文档在线预览
	 * file_edit	文档在线编辑
	 * file_format_control	文档在线转换
	 * corp_contacts_mgr	企业通讯录
	 * app_files_synerg_mgr	应用文档管理
	 */
	private String scope;
    
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}
}
