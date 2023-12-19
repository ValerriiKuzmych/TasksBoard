package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;


@Entity(name = "task_statuses")
public class TaskStatus {
	
	@Id
    private Long id;  
	
	@OneToOne(mappedBy = "taskStatus", cascade = CascadeType.ALL)
	@MapsId
	private Task task;

	private boolean newTask;
	private boolean taskInProgress;
	private boolean taskUnderReview;
	private boolean taskCompleted;
	private boolean taskArchived;

	public TaskStatus() {
		super();
	}

	public boolean isNewTask() {
		return newTask;
	}

	public void setNewTask(boolean newTask) {
		this.newTask = newTask;
	}

	public boolean isTaskInProgress() {
		return taskInProgress;
	}

	public void setTaskInProgress(boolean taskInProgress) {
		this.taskInProgress = taskInProgress;
	}

	public boolean isTaskUnderReview() {
		return taskUnderReview;
	}

	public void setTaskUnderReview(boolean taskUnderReview) {
		this.taskUnderReview = taskUnderReview;
	}

	public boolean isTaskCompleted() {
		return taskCompleted;
	}

	public void setTaskCompleted(boolean taskCompleted) {
		this.taskCompleted = taskCompleted;
	}

	public boolean isTaskArchived() {
		return taskArchived;
	}

	public void setTaskArchived(boolean taskArchived) {
		this.taskArchived = taskArchived;
	}

	
}
