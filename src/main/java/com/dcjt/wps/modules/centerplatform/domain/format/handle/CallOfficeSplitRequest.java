package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOfficeSplitRequest {
	
	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("doc_url")
	private String docUrl;
	
	@JsonProperty("doc_filename")
	private String docFileName;
		
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("average")
	private Average average;
	
	@JsonProperty("ranges")
	private List<Range> ranges;
	
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Average getAverage() {
		return average;
	}

	public void setAverage(Average average) {
		this.average = average;
	}

	public List<Range> getRanges() {
		return ranges;
	}

	public void setRanges(List<Range> ranges) {
		this.ranges = ranges;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Average {
		
		@JsonProperty("size")
		private int size;
		
		@JsonProperty("split_range")
		private Range splitRange;

		public int getSize() {
			return size;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public Range getSplitRange() {
			return splitRange;
		}

		public void setSplitRange(Range splitRange) {
			this.splitRange = splitRange;
		}
		
	}
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class Range {
		
		@JsonProperty("start")
		private int start;
		
		@JsonProperty("end")
		private int end;

		public int getStart() {
			return start;
		}

		public void setStart(int start) {
			this.start = start;
		}

		public int getEnd() {
			return end;
		}

		public void setEnd(int end) {
			this.end = end;
		}
		
	}
	
}
