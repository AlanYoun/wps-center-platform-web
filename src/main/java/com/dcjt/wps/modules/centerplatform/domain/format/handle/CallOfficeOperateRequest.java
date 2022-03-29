package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOfficeOperateRequest {

	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("doc_url")
	private String docUrl;
	
	@JsonProperty("doc_filename")
	private String docFileName;
	
	@JsonProperty("steps")
	private List<Step> steps;
	
	@JsonProperty("callback")
	private String callback;
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public String getDocFileName() {
		return docFileName;
	}

	public void setDocFileName(String docFileName) {
		this.docFileName = docFileName;
	}

	public List<Step> getSteps() {
		return steps;
	}

	public void setSteps(List<Step> steps) {
		this.steps = steps;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Step {
		
		@JsonProperty("operate")
		private String operate;
		
		@JsonProperty("args")
		private Args args;

		public String getOperate() {
			return operate;
		}

		public void setOperate(String operate) {
			this.operate = operate;
		}

		public Args getArgs() {
			return args;
		}

		public void setArgs(Args args) {
			this.args = args;
		}
		
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Args {
		
		@JsonProperty("text_watermark")
		private TextWatermark textWatermark;
		
		@JsonProperty("image_watermark")
		private ImageWatermark imageWatermark;

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
		
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class TextWatermark {
		
		@JsonProperty("content")
		private String content;
		
		@JsonProperty("size")
		private long size;
		
		@JsonProperty("color")
		private String color;
		
		@JsonProperty("transparent")
		private float transparent;
		
		@JsonProperty("tilt")
		private boolean tilt;
		
		@JsonProperty("position")
		private String position;
		
		@JsonProperty("tiled")
		private boolean tiled;

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public long getSize() {
			return size;
		}

		public void setSize(long size) {
			this.size = size;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public float getTransparent() {
			return transparent;
		}

		public void setTransparent(float transparent) {
			this.transparent = transparent;
		}

		public boolean isTilt() {
			return tilt;
		}

		public void setTilt(boolean tilt) {
			this.tilt = tilt;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public boolean isTiled() {
			return tiled;
		}

		public void setTiled(boolean tiled) {
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
		private boolean noWashout;
		
		@JsonProperty("tilt")
		private boolean tilt;
		
		@JsonProperty("position")
		private String position;
		
		@JsonProperty("tiled")
		private boolean tiled;
		
		@JsonProperty("scale")
		private int scale;

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

		public boolean isNoWashout() {
			return noWashout;
		}

		public void setNoWashout(boolean noWashout) {
			this.noWashout = noWashout;
		}

		public boolean isTilt() {
			return tilt;
		}

		public void setTilt(boolean tilt) {
			this.tilt = tilt;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public boolean isTiled() {
			return tiled;
		}

		public void setTiled(boolean tiled) {
			this.tiled = tiled;
		}

		public int getScale() {
			return scale;
		}

		public void setScale(int scale) {
			this.scale = scale;
		}
			
	}
	
}
