package entities.creatingObjects;

import entities.TasksBoard;
import java.util.Scanner;

public class newTasksBoard {

	public void newTasksBoardCreating() {

		TasksBoard newTasksBoard = new TasksBoard();

		newTasksBoard.setTasksBoardName(inputTasksBoardName());

	};

	public String inputTasksBoardName() {

		Scanner scanner = new Scanner(System.in);

		String inputName = scanner.nextLine();

		System.out.print("Enter name: " + inputName);

		scanner.close();

		return inputName;

	}

}
