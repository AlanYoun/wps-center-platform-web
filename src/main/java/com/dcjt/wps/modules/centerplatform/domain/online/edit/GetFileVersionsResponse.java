package com.dcjt.wps.modules.centerplatform.domain.online.edit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetFileVersionsResponse {
    
    @JsonProperty("histories")
    private List<File> files;
        
	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
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
	    
	    @JsonProperty("download_url")
	    private String downloadUrl;
	    
	    @JsonProperty("create_time")
	    private long createTime;
	    
	    @JsonProperty("modify_time")
	    private long modifyTime;
	    
	    @JsonProperty("creator")
	    private User creator;
	    
	    @JsonProperty("modifier")
	    private User modifier;
	    
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

		public String getDownloadUrl() {
			return downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}

		public long getCreateTime() {
			return createTime;
		}

		public void setCreateTime(long createTime) {
			this.createTime = createTime;
		}

		public long getModifyTime() {
			return modifyTime;
		}

		public void setModifyTime(long modifyTime) {
			this.modifyTime = modifyTime;
		}

		public User getCreator() {
			return creator;
		}

		public void setCreator(User creator) {
			this.creator = creator;
		}

		public User getModifier() {
			return modifier;
		}

		public void setModifier(User modifier) {
			this.modifier = modifier;
		}

		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class User { 
			
			@JsonProperty("id")
		    private String id;
			
			@JsonProperty("name")
		    private String name;
			
			@JsonProperty("avatar_url")
		    private String avatarUrl;

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

			public String getAvatarUrl() {
				return avatarUrl;
			}

			public void setAvatarUrl(String avatarUrl) {
				this.avatarUrl = avatarUrl;
			}
			
		}

	}
	
}
