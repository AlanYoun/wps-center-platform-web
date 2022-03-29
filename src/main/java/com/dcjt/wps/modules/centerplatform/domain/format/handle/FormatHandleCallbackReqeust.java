package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormatHandleCallbackReqeust {
	
	@JsonProperty("task_id")
    private String taskId;
	
	@JsonProperty("result")
    private Result result;
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "{" + (taskId != null ? "taskId=" + taskId + ", " : "") + (result != null ? "result=" + result : "")
				+ "}";
	}


	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Result {
		
		@JsonProperty("success")
	    private boolean success;
		
		@JsonProperty("message")
	    private String message;
		
		@JsonProperty("download_id")
	    private String downloadId;

		public boolean isSuccess() {
			return success;
		}

		public void setSuccess(boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDownloadId() {
			return downloadId;
		}

		public void setDownloadId(String downloadId) {
			this.downloadId = downloadId;
		}

		@Override
		public String toString() {
			return "{success=" + success + ", " + (message != null ? "message=" + message + ", " : "")
					+ (downloadId != null ? "downloadId=" + downloadId : "") + "}";
		}
				
	}
}
