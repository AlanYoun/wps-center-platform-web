package com.dcjt.wps.modules.centerplatform.domain.format.handle;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallOfficeMergeRequest {

	@JsonProperty("task_id")
	private String taskId;
	
	@JsonProperty("merged_file_list")
	private List<MergedFile> mergedLileList;
	
	@JsonProperty("callback")
	private String callback;
	
	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<MergedFile> getMergedLileList() {
		return mergedLileList;
	}

	public void setMergedLileList(List<MergedFile> mergedLileList) {
		this.mergedLileList = mergedLileList;
	}

	public String getCallback() {
		return callback;
	}

	public void setCallback(String callback) {
		this.callback = callback;
	}

	@JsonInclude(JsonInclude.Include.NON_NULL)
	public static class MergedFile {
		
		@JsonProperty("doc_url")
		private String docUrl;
		
		@JsonProperty("doc_filename")
		private String docFileName;
		
		@JsonProperty("start")
		private String start;
		
		@JsonProperty("end")
		private String end;

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

		public String getStart() {
			return start;
		}

		public void setStart(String start) {
			this.start = start;
		}

		public String getEnd() {
			return end;
		}

		public void setEnd(String end) {
			this.end = end;
		}
		
	}
	
}
