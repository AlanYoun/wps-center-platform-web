package com.dcjt.wps.modules.centerplatform.domain.online.edit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetFileResponse {
	
	@JsonProperty("result")
	private Long result;
	
	@JsonProperty("msg")
	private String msg;
    
    @JsonProperty("file")
    private File file;
        
    @JsonProperty("user")
    private User user;

	public Long getResult() {
		return result;
	}

	public void setResult(Long result) {
		this.result = result;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
	    
	    @JsonProperty("preview_pages")
	    private int preview_pages;

	    @JsonProperty("user_acl")
	    private UserAccessControlList userAcl;
	    
	    @JsonProperty("watermark")
	    private Watermark watermark;
	    
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

		public int getPreview_pages() {
			return preview_pages;
		}

		public void setPreview_pages(int preview_pages) {
			this.preview_pages = preview_pages;
		}

		public UserAccessControlList getUserAcl() {
			return userAcl;
		}

		public void setUserAcl(UserAccessControlList userAcl) {
			this.userAcl = userAcl;
		}

		public Watermark getWatermark() {
			return watermark;
		}

		public void setWatermark(Watermark watermark) {
			this.watermark = watermark;
		}
		
		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class UserAccessControlList {
			
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
		
		@JsonInclude(JsonInclude.Include.NON_NULL)
		public static class Watermark {
		       
		    @JsonProperty("type")
		    private int type;
		    
		    @JsonProperty("value")
		    private String value;
		    
		    @JsonProperty("fillstyle")
		    private String fillstyle;
		    
		    @JsonProperty("font")
		    private String font;
		    
		    @JsonProperty("rotate")
		    private Long rotate;
		    
		    @JsonProperty("horizontal")
		    private Long horizontal;
		    
		    @JsonProperty("vertical")
		    private Long vertical;

		    public int getType() {
		        return type;
		    }

		    public void setType(int type) {
		        this.type = type;
		    }

		    public String getValue() {
		        return value;
		    }

		    public void setValue(String value) {
		        this.value = value;
		    }

		    public String getFillstyle() {
		        return fillstyle;
		    }

		    public void setFillstyle(String fillstyle) {
		        this.fillstyle = fillstyle;
		    }

		    public String getFont() {
		        return font;
		    }

		    public void setFont(String font) {
		        this.font = font;
		    }

		    public Long getRotate() {
		        return rotate;
		    }

		    public void setRotate(Long rotate) {
		        this.rotate = rotate;
		    }

		    public Long getHorizontal() {
		        return horizontal;
		    }

		    public void setHorizontal(Long horizontal) {
		        this.horizontal = horizontal;
		    }

		    public Long getVertical() {
		        return vertical;
		    }

		    public void setVertical(Long vertical) {
		        this.vertical = vertical;
		    }
		    
		}
	    
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class User {
		
		@JsonProperty("id")
	    private String id;
		
		@JsonProperty("name")
	    private String name;
		
		@JsonProperty("permission")
	    private String permission;
		
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

		public String getPermission() {
			return permission;
		}

		public void setPermission(String permission) {
			this.permission = permission;
		}

		public String getAvatarUrl() {
			return avatarUrl;
		}

		public void setAvatarUrl(String avatarUrl) {
			this.avatarUrl = avatarUrl;
		}
		
	}
	
}
