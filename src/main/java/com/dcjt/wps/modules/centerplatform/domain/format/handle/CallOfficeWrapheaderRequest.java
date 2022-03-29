package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOfficeWrapheaderRequest {
	
	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("template_url")
	private String templateUrl;
	
	@JsonProperty("template_filename")
	private String templateFileName;
	
	@JsonProperty("sample_list")
	private List<Sample> sampleList;
	
	@JsonProperty("callback")
	private String callback;
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
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

	public List<Sample> getSampleList() {
		return sampleList;
	}

	public void setSampleList(List<Sample> sampleList) {
		this.sampleList = sampleList;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Sample {
		
		@JsonProperty("bookmark")
		private String bookmark;
		
		@JsonProperty("type")
		private String type;
		
		@JsonProperty("sample_url")
		private String sampleUrl;
		
		@JsonProperty("sample_filename")
		private String sampleFileName;
			
		@JsonProperty("text")
		private String text;

		public String getBookmark() {
			return bookmark;
		}

		public void setBookmark(String bookmark) {
			this.bookmark = bookmark;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSampleUrl() {
			return sampleUrl;
		}

		public void setSampleUrl(String sampleUrl) {
			this.sampleUrl = sampleUrl;
		}

		public String getSampleFileName() {
			return sampleFileName;
		}

		public void setSampleFileName(String sampleFileName) {
			this.sampleFileName = sampleFileName;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
		
	}
	
}
