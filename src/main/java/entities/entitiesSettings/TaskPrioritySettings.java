package entities.entitiesSettings;

import entities.Task;
import entities.TaskPriority;

public class TaskPrioritySettings {

	public void setTaskPriorityLow(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskPriority(setPriorityLow(changeableTask.getTaskPriority()));

	}

	public void setTaskPriorityMedium(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskPriority(setPriorityMedium(changeableTask.getTaskPriority()));

	}

	public void setTaskPriorityHigh(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskPriority(setPriorityHigh(changeableTask.getTaskPriority()));

	}

	public void setTaskPrioritySuperHigh(Task task) {

		Task changeableTask = task;

		changeableTask.setTaskPriority(setPrioritySuperHigh(changeableTask.getTaskPriority()));

	}

	public TaskPriority setPriorityLow(TaskPriority priority) {

		TaskPriority changeablePriority = priority;

		changeablePriority.setLowPriority(true);
		changeablePriority.setMediumPriority(false);
		changeablePriority.setHighPriority(false);
		changeablePriority.setSuperHighPriority(false);

		return changeablePriority;
	}

	public TaskPriority setPriorityMedium(TaskPriority priority) {

		TaskPriority changeablePriority = priority;

		changeablePriority.setLowPriority(false);
		changeablePriority.setMediumPriority(true);
		changeablePriority.setHighPriority(false);
		changeablePriority.setSuperHighPriority(false);

		return changeablePriority;
	}

	public TaskPriority setPriorityHigh(TaskPriority priority) {

		TaskPriority changeablePriority = priority;

		changeablePriority.setLowPriority(false);
		changeablePriority.setMediumPriority(false);
		changeablePriority.setHighPriority(true);
		changeablePriority.setSuperHighPriority(false);

		return changeablePriority;
	}

	public TaskPriority setPrioritySuperHigh(TaskPriority priority) {

		TaskPriority changeablePriority = priority;

		changeablePriority.setLowPriority(false);
		changeablePriority.setMediumPriority(false);
		changeablePriority.setHighPriority(false);
		changeablePriority.setSuperHighPriority(true);

		return changeablePriority;
	}

}
