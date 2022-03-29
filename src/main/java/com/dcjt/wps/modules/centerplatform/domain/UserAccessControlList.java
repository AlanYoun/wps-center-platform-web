package com.dcjt.wps.modules.centerplatform.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAccessControlList {
	
	@JsonProperty("rename")
    private int rename;
	
	@JsonProperty("history")
    private int history;
	
	@JsonProperty("copy")
    private int copy;
    
    @JsonProperty("export")
    private int export;
    
    @JsonProperty("print")
    private int print;

	public int getRename() {
		return rename;
	}

	public void setRename(int rename) {
		this.rename = rename;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public int getCopy() {
		return copy;
	}

	public void setCopy(int copy) {
		this.copy = copy;
	}

	public int getExport() {
		return export;
	}

	public void setExport(int export) {
		this.export = export;
	}

	public int getPrint() {
		return print;
	}

	public void setPrint(int print) {
		this.print = print;
	}
    
}
