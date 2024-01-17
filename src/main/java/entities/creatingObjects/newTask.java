package entities.creatingObjects;

import java.util.Scanner;

import entities.Task;
import entities.TaskStatus;

public class newTask {

	TaskStatus taskStatus = new TaskStatus();

	public void newTaskCreating() {

		Task newTask = new Task();

		taskStatus.setNewTask(true);

		newTask.setTaskDescription(inputTaskDescription());
		newTask.setTaskStatus(taskStatus);

	}

	public String inputTaskDescription() {

		Scanner scanner = new Scanner(System.in);

		String inputDescription = scanner.nextLine();

		System.out.print("Enter name: " + inputDescription);

		scanner.close();

		return inputDescription;

	}

}
