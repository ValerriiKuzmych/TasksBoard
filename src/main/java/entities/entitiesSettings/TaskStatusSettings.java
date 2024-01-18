package entities.entitiesSettings;

import entities.Task;
import entities.TaskStatus;

public class TaskStatusSettings {

	public void setTaskStatusNew(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskStatus(setStatusNew(changeableTask.getTaskStatus()));

	}

	public void setTaskStatusInProgress(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskStatus(setStatusInProgress(changeableTask.getTaskStatus()));

	}

	public void setTaskStatusUnderReview(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskStatus(setStatusUnderReview(changeableTask.getTaskStatus()));

	}

	public void setTaskStatusCompleted(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskStatus(setStatusCompleted(changeableTask.getTaskStatus()));

	}

	public void setTaskStatusArchived(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskStatus(setStatusArchived(changeableTask.getTaskStatus()));

	}

	public TaskStatus setStatusNew(TaskStatus status) {

		TaskStatus changeableStatus = status;

		changeableStatus.setNewTask(true);
		changeableStatus.setTaskInProgress(false);
		changeableStatus.setTaskUnderReview(false);
		changeableStatus.setTaskCompleted(false);
		changeableStatus.setTaskArchived(false);

		return changeableStatus;
	}

	public TaskStatus setStatusInProgress(TaskStatus status) {

		TaskStatus changeableStatus = status;

		changeableStatus.setNewTask(false);
		changeableStatus.setTaskInProgress(true);
		changeableStatus.setTaskUnderReview(false);
		changeableStatus.setTaskCompleted(false);
		changeableStatus.setTaskArchived(false);

		return changeableStatus;
	}

	public TaskStatus setStatusUnderReview(TaskStatus status) {

		TaskStatus changeableStatus = status;

		changeableStatus.setNewTask(false);
		changeableStatus.setTaskInProgress(false);
		changeableStatus.setTaskUnderReview(true);
		changeableStatus.setTaskCompleted(false);
		changeableStatus.setTaskArchived(false);

		return changeableStatus;
	}

	public TaskStatus setStatusCompleted(TaskStatus status) {

		TaskStatus changeableStatus = status;

		changeableStatus.setNewTask(false);
		changeableStatus.setTaskInProgress(false);
		changeableStatus.setTaskUnderReview(false);
		changeableStatus.setTaskCompleted(true);
		changeableStatus.setTaskArchived(false);

		return changeableStatus;
	}

	public TaskStatus setStatusArchived(TaskStatus status) {

		TaskStatus changeableStatus = status;

		changeableStatus.setNewTask(false);
		changeableStatus.setTaskInProgress(false);
		changeableStatus.setTaskUnderReview(false);
		changeableStatus.setTaskCompleted(false);
		changeableStatus.setTaskArchived(true);

		return changeableStatus;
	}

}
