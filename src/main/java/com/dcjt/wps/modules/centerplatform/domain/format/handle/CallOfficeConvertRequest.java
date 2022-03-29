package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOfficeConvertRequest {
	
	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("doc_url")
	private String docUrl;
	
	@JsonProperty("doc_filename")
	private String docFileName;
		
	@JsonProperty("target_file_format")
	private String targetFileFormat;
	
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

	public String getTargetFileFormat() {
		return targetFileFormat;
	}

	public void setTargetFileFormat(String targetFileFormat) {
		this.targetFileFormat = targetFileFormat;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}
	
}
