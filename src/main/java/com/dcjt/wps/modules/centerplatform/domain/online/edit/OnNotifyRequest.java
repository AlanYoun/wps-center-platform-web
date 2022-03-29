package com.dcjt.wps.modules.centerplatform.domain.online.edit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OnNotifyRequest {

	@JsonProperty("cmd")
    private String cmd;
	
	@JsonProperty("body")
    private Body body;
	
	public String getCmd() {
		return cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}
	
	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "OnNotifyRequest [" + (cmd != null ? "cmd=" + cmd + ", " : "") + (body != null ? "body=" + body : "")
				+ "]";
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Body {
		
		@JsonProperty("file_id")
	    private String fileId;
		
		@JsonProperty("userid")
	    private String userId;
		
		@JsonProperty("counts")
	    private long counts;
		
		@JsonProperty("maxcounts")
	    private long maxCounts;
		
		@JsonProperty("operated_time")
	    private long operatedTime;
		
		@JsonProperty("result")
	    private String result;
		
		@JsonProperty("detail")
	    private String detail;
		
		@JsonProperty("active")
	    private String active;
		
		@JsonProperty("filesize")
	    private String filesize;
		
		@JsonProperty("filetype")
	    private String filetype;
		
		@JsonProperty("permission")
	    private String permission;

		public String getFileId() {
			return fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public long getCounts() {
			return counts;
		}

		public void setCounts(long counts) {
			this.counts = counts;
		}

		public long getMaxCounts() {
			return maxCounts;
		}

		public void setMaxCounts(long maxCounts) {
			this.maxCounts = maxCounts;
		}

		public long getOperatedTime() {
			return operatedTime;
		}

		public void setOperatedTime(long operatedTime) {
			this.operatedTime = operatedTime;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getDetail() {
			return detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public String getActive() {
			return active;
		}

		public void setActive(String active) {
			this.active = active;
		}

		public String getFilesize() {
			return filesize;
		}

		public void setFilesize(String filesize) {
			this.filesize = filesize;
		}

		public String getFiletype() {
			return filetype;
		}

		public void setFiletype(String filetype) {
			this.filetype = filetype;
		}

		public String getPermission() {
			return permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}

		@Override
		public String toString() {
			return "Body [" + (fileId != null ? "fileId=" + fileId + ", " : "")
					+ (userId != null ? "userId=" + userId + ", " : "") + "counts=" + counts + ", maxCounts="
					+ maxCounts + ", operatedTime=" + operatedTime + ", "
					+ (result != null ? "result=" + result + ", " : "")
					+ (detail != null ? "detail=" + detail + ", " : "")
					+ (active != null ? "active=" + active + ", " : "")
					+ (filesize != null ? "filesize=" + filesize + ", " : "")
					+ (filetype != null ? "filetype=" + filetype + ", " : "")
					+ (permission != null ? "permission=" + permission : "") + "]";
		}
		
	}
	
	
	
}
