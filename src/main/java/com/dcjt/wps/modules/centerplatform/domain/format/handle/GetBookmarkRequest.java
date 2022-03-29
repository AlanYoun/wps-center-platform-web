package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetBookmarkRequest {
	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("doc_url")
	private String docUrl;
	
	@JsonProperty("doc_filename")
	private String docFileName;
	
	@JsonProperty("bookmark_type")
	private String bookmarkType;
	
	@JsonProperty("bookmark_name")
	private String bookmarkName;
	
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

	public String getBookmarkType() {
		return bookmarkType;
	}

	public void setBookmarkType(String bookmarkType) {
		this.bookmarkType = bookmarkType;
	}

	public String getBookmarkName() {
		return bookmarkName;
	}

	public void setBookmarkName(String bookmarkName) {
		this.bookmarkName = bookmarkName;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

}
