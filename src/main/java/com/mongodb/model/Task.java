package com.mongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Document(collation = "task")
@Document(collection = "task") //collection name is here most important 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

	@Id
	private String tackId;
	private String description;
	private int severity;
	private String assignee;
	private int storyPoint;
	
	
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(String tackId, String description, int severity, String assignee, int storyPoint) {
		super();
		this.tackId = tackId;
		this.description = description;
		this.severity = severity;
		this.assignee = assignee;
		this.storyPoint = storyPoint;
	}
	public String getTackId() {
		return tackId;
	}
	public void setTackId(String tackId) {
		this.tackId = tackId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public int getStoryPoint() {
		return storyPoint;
	}
	public void setStoryPoint(int storyPoint) {
		this.storyPoint = storyPoint;
	}
	
}
