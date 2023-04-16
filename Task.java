///////////////////////////////////////////////////////////////////////////////
//                   ASSIGNMENT INFORMATION
// File:             Task.java
// Course ID:        CS-320-T4208
// Course Name:		 Software Test Automation & QA
// Author:           Eric Farkas
// Assignment:		 Project One
///////////////////////////////////////////////////////////////////////////////

public class Task {
	private String taskId;
	private String taskName;
	private String taskDescription;
	
	Task() {
		taskId = "DEFAULT";
		taskName = "DEFAULT";
		taskDescription = "DEFAULT";
	}
	
	Task(String taskId) {
		checkTaskId(taskId);
		taskName = "DEFAULT";
		taskDescription = "DEFAULT";
	}
	
	Task(String taskId, String taskName) {
		checkTaskId(taskId);
		setName(taskName);
		taskDescription = "DEFAULT";
	}
	
	Task(String taskId, String taskName, String taskDescription) {
		checkTaskId(taskId);
		setName(taskName);
		setDescription(taskDescription);
	}
	
	public final String getTaskId() { return taskId; }
	
	public final String getName() { return taskName; }
	
	protected void setName(String name) {
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException(
					"Task name is invalid. Enter a name shorter than 20 characters - do not leave blank.");
		}
		else {
			this.taskName = name;
		}
	}
	
	public final String getDescription() { return taskDescription; }
	
	protected void setDescription(String taskDescription) {
		if (taskDescription == null || taskDescription.length() > 50) {
			throw new IllegalArgumentException(
					"Task description is invalid. Enter a description shorter than 50 characters - do not leave blank.");
		}
		else {
			this.taskDescription = taskDescription;
		}
	}
	
	private void checkTaskId(String taskId) {
		if (taskId == null || taskId.length() > 10) {
			throw new IllegalArgumentException(
					"Task ID is invalid.  Enter an ID shorter than 10 characters - do not leave blank.");
		}
		else {
			this.taskId = taskId;
		}
	}
}