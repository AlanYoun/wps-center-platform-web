package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetTaskResponse {

	@JsonProperty("result")
	private int result;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("download_id")
	private String downloadId;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDownloadId() {
		return downloadId;
	}

	public void setDownloadId(String downloadId) {
		this.downloadId = downloadId;
	}
	
}
