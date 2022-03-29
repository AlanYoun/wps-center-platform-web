package com.dcjt.wps.modules.centerplatform.domain.online.preview;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOnlinePreviewUrlResponse {
	
	@JsonProperty("result")
    private int result;
	
	@JsonProperty("url")
	private String url;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
