package com.dcjt.wps.modules.centerplatform.domain.online.edit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetFileVersionResponse {
    
    @JsonProperty("file")
    private File file;
        
	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class File {
	    
	    @JsonProperty("id")
	    private String id;
	    
	    @JsonProperty("name")
	    private String name;
	    
	    @JsonProperty("version")
	    private int version;
	    
	    @JsonProperty("size")
	    private long size;
	    
	    @JsonProperty("creator")
	    private String creator;
	    
	    @JsonProperty("create_time")
	    private long createTime;
	    
	    @JsonProperty("modifier")
	    private String modifier;
	    
	    @JsonProperty("modify_time")
	    private long modifyTime;
	    
	    @JsonProperty("download_url")
	    private String downloadUrl;
	    
	    
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		public long getSize() {
			return size;
		}

		public void setSize(long size) {
			this.size = size;
		}

		public String getCreator() {
			return creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public long getCreateTime() {
			return createTime;
		}

		public void setCreateTime(long createTime) {
			this.createTime = createTime;
		}

		public String getModifier() {
			return modifier;
		}

		public void setModifier(String modifier) {
			this.modifier = modifier;
		}

		public long getModifyTime() {
			return modifyTime;
		}

		public void setModifyTime(long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getDownloadUrl() {
			return downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

	}
	
}
