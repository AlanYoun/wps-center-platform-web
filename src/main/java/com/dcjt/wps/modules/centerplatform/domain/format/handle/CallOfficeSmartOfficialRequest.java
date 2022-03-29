package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOfficeSmartOfficialRequest {

	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("doc_url")
	private String docUrl;
	
	@JsonProperty("doc_filename")
	private String docFileName;
		
	@JsonProperty("template_url")
	private String templateUrl;
	
	@JsonProperty("template_filename")
	private String templateFileName;
		
	@JsonProperty("pre_install_template")
	private String preInstallTemplate;
	
	@JsonProperty("field_config")
	private String fieldConfig;
	
	@JsonProperty("callback")
	private String callback;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public String getDocFileName() {
		return docFileName;
	}

	public void setDocFileName(String docFileName) {
		this.docFileName = docFileName;
	}

	public String getTemplateUrl() {
		return templateUrl;
	}

	public void setTemplateUrl(String templateUrl) {
		this.templateUrl = templateUrl;
	}

	public String getTemplateFileName() {
		return templateFileName;
	}

	public void setTemplateFileName(String templateFileName) {
		this.templateFileName = templateFileName;
	}

	public String getPreInstallTemplate() {
		return preInstallTemplate;
	}

	public void setPreInstallTemplate(String preInstallTemplate) {
		this.preInstallTemplate = preInstallTemplate;
	}

	public String getFieldConfig() {
		return fieldConfig;
	}

	public void setFieldConfig(String fieldConfig) {
		this.fieldConfig = fieldConfig;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}
	
}
