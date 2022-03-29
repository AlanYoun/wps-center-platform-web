package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOfficeWrapheaderResponse {

	@JsonProperty("result")
	private int result;
	
	@JsonProperty("msg")
	private String msg;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
