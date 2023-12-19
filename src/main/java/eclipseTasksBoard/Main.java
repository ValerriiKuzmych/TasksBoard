package eclipseTasksBoard;

import java.util.ArrayList;
import java.util.List;

import entities.Administrator;
import entities.Task;
import entities.TasksBoard;
import entities.DAO.AdministratorDAO;
import entities.DAO.TaskDAO;
import entities.DAO.TasksBoardDAO;

public class Main {

	public static void main(String[] args) {

		Administrator admin1 = new Administrator();
		Administrator admin2 = new Administrator();

		// Создаем администраторов в базе данных
		AdministratorDAO adminDAO = new AdministratorDAO();
		adminDAO.add(admin1);
		adminDAO.add(admin2);

		// Создаем списки для панелей задач и задач
		List<TasksBoard> tasksBoards1 = new ArrayList<>();
		List<TasksBoard> tasksBoards2 = new ArrayList<>();

		List<Task> tasksList1 = new ArrayList<>();
		List<Task> tasksList2 = new ArrayList<>();

		// Создаем панели задач для первого администратора
		TasksBoard tasksBoard1 = new TasksBoard();
		TasksBoard tasksBoard2 = new TasksBoard();

		// Устанавливаем связь между панелями и администратором
		tasksBoards1.add(tasksBoard1);
		tasksBoards1.add(tasksBoard2);
		admin1.setTaskBoardList(tasksBoards1);

		tasksBoard1.setAdministrator(admin1);
		tasksBoard2.setAdministrator(admin1);

		// Создаем панели задач для второго администратора
		TasksBoard tasksBoard3 = new TasksBoard();
		TasksBoard tasksBoard4 = new TasksBoard();

		// Устанавливаем связь между панелями и администратором
		tasksBoards2.add(tasksBoard3);
		tasksBoards2.add(tasksBoard4);
		admin2.setTaskBoardList(tasksBoards2);

		tasksBoard3.setAdministrator(admin2);
		tasksBoard4.setAdministrator(admin2);

		// Создаем задачи для первой панели задач
		Task task1 = new Task();
		Task task2 = new Task();
		Task task3 = new Task();

		// Устанавливаем связь между задачами и панелью задач
		tasksList1.add(task1);
		tasksList1.add(task2);
		tasksList1.add(task3);
		
		
		admin1.setTasksList(tasksList1);

		task1.setAdministrator(admin1);
		task2.setAdministrator(admin1);
		task3.setAdministrator(admin1);
		tasksBoard1.setTasksList(tasksList1);

		task1.setTasksBoard(tasksBoard1);
		task2.setTasksBoard(tasksBoard1);
		task3.setTasksBoard(tasksBoard1);

		// Создаем задачи для второй панели задач
		Task task4 = new Task();
		Task task5 = new Task();
		Task task6 = new Task();

		// Устанавливаем связь между задачами и панелью задач
		tasksList2.add(task4);
		tasksList2.add(task5);
		tasksList2.add(task6);

		admin2.setTasksList(tasksList1);

		task4.setAdministrator(admin2);
		task5.setAdministrator(admin2);
		task6.setAdministrator(admin2);

		tasksBoard2.setTasksList(tasksList2);

		task4.setTasksBoard(tasksBoard2);
		task5.setTasksBoard(tasksBoard2);
		task6.setTasksBoard(tasksBoard2);

		// Создаем DAO для панелей задач и задач
		TasksBoardDAO tasksBoardDAO = new TasksBoardDAO();
		TaskDAO taskDAO = new TaskDAO();

		// Сохраняем все объекты в базу данных
		tasksBoardDAO.add(tasksBoard1);
		tasksBoardDAO.add(tasksBoard2);
		tasksBoardDAO.add(tasksBoard3);
		tasksBoardDAO.add(tasksBoard4);

		taskDAO.add(task1);
		taskDAO.add(task2);
		taskDAO.add(task3);
		taskDAO.add(task4);
		taskDAO.add(task5);
		taskDAO.add(task6);

	}

}
