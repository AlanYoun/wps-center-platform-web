package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallImageOperateRequest {

	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("image_url")
	private String imageUrl;
	
	@JsonProperty("image_filename")
	private String imageFileName;
		
	@JsonProperty("scale")
	private Float scale;
	
	@JsonProperty("width")
	private Integer width;
	
	@JsonProperty("height")
	private Integer height;
	
	@JsonProperty("rotate")
	private int rotate;
	
	@JsonProperty("quality")
	private Float quality;
	
	@JsonProperty("horizontal_flip")
	private Boolean horizontalFlip;
	
	@JsonProperty("vertical_flip")
	private Boolean verticalFlip;
	
	@JsonProperty("text_watermark")
	private TextWatermark textWatermark;
	
	@JsonProperty("image_watermark")
	private ImageWatermark imageWatermark;
	
	@JsonProperty("callback")
	private String callback;
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public Float getScale() {
		return scale;
	}

	public void setScale(Float scale) {
		this.scale = scale;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public int getRotate() {
		return rotate;
	}

	public void setRotate(int rotate) {
		this.rotate = rotate;
	}

	public Float getQuality() {
		return quality;
	}

	public void setQuality(Float quality) {
		this.quality = quality;
	}

	public Boolean getHorizontalFlip() {
		return horizontalFlip;
	}

	public void setHorizontalFlip(Boolean horizontalFlip) {
		this.horizontalFlip = horizontalFlip;
	}

	public Boolean getVerticalFlip() {
		return verticalFlip;
	}

	public void setVerticalFlip(Boolean verticalFlip) {
		this.verticalFlip = verticalFlip;
	}
	
	public TextWatermark getTextWatermark() {
		return textWatermark;
	}

	public void setTextWatermark(TextWatermark textWatermark) {
		this.textWatermark = textWatermark;
	}

	public ImageWatermark getImageWatermark() {
		return imageWatermark;
	}

	public void setImageWatermark(ImageWatermark imageWatermark) {
		this.imageWatermark = imageWatermark;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class TextWatermark {
		
		@JsonProperty("content")
		private String content;
		
		@JsonProperty("size")
		private Long size;
		
		@JsonProperty("color")
		private String color;
		
		@JsonProperty("transparent")
		private Float transparent;
		
		@JsonProperty("tilt")
		private Boolean tilt;
		
		@JsonProperty("position")
		private String position;
		
		@JsonProperty("tiled")
		private Boolean tiled;

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getSize() {
			return size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Float getTransparent() {
			return transparent;
		}

		public void setTransparent(Float transparent) {
			this.transparent = transparent;
		}

		public Boolean getTilt() {
			return tilt;
		}

		public void setTilt(Boolean tilt) {
			this.tilt = tilt;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public Boolean getTiled() {
			return tiled;
		}

		public void setTiled(Boolean tiled) {
			this.tiled = tiled;
		}
		
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class ImageWatermark {
		
		@JsonProperty("watermark_url")
		private String watermarkUrl;
		
		@JsonProperty("watermark_filename")
		private String watermarkFileName;
		
		@JsonProperty("no_washout")
		private Boolean noWashout;
		
		@JsonProperty("tilt")
		private Boolean tilt;
		
		@JsonProperty("position")
		private String position;
		
		@JsonProperty("tiled")
		private Boolean tiled;
		
		@JsonProperty("scale")
		private Integer scale;

		public String getWatermarkUrl() {
			return watermarkUrl;
		}

		public void setWatermarkUrl(String watermarkUrl) {
			this.watermarkUrl = watermarkUrl;
		}

		public String getWatermarkFileName() {
			return watermarkFileName;
		}

		public void setWatermarkFileName(String watermarkFileName) {
			this.watermarkFileName = watermarkFileName;
		}

		public Boolean getNoWashout() {
			return noWashout;
		}

		public void setNoWashout(Boolean noWashout) {
			this.noWashout = noWashout;
		}

		public Boolean getTilt() {
			return tilt;
		}

		public void setTilt(Boolean tilt) {
			this.tilt = tilt;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public Boolean getTiled() {
			return tiled;
		}

		public void setTiled(Boolean tiled) {
			this.tiled = tiled;
		}

		public Integer getScale() {
			return scale;
		}

		public void setScale(Integer scale) {
			this.scale = scale;
		}
			
	}
	
}
