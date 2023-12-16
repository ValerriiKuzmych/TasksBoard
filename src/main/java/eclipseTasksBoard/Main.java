package eclipseTasksBoard;

import java.util.ArrayList;
import java.util.List;

import entities.Administrator;
import entities.TasksBoard;
import entities.DAO.AdministratorDAO;
import entities.DAO.TasksBoardDAO;

public class Main {
	
	public static void main(String[] args) {
		
		Administrator admin0 = new Administrator();
		Administrator admin1 = new Administrator();

		AdministratorDAO adminDAO = new AdministratorDAO();
		adminDAO.add(admin0);
		adminDAO.add(admin1);

		TasksBoard tasksBoard0 = new TasksBoard();
		tasksBoard0.setAdministrator(admin0);

		TasksBoard tasksBoard1 = new TasksBoard();
		tasksBoard1.setAdministrator(admin0);

		TasksBoard tasksBoard2 = new TasksBoard();
		tasksBoard2.setAdministrator(admin1);

		TasksBoardDAO tasksBoardDAO = new TasksBoardDAO();

		tasksBoardDAO.add(tasksBoard0);
		tasksBoardDAO.add(tasksBoard1);
		tasksBoardDAO.add(tasksBoard2);

		List<TasksBoard> tasksBoards0 = new ArrayList<>();
		List<TasksBoard> tasksBoards1 = new ArrayList<>();

		tasksBoards0.add(tasksBoard0);
		tasksBoards0.add(tasksBoard1);
		tasksBoards1.add(tasksBoard2);

		admin0.setTaskBoardList(tasksBoards1);
		admin1.setTaskBoardList(tasksBoards0);
		adminDAO.update(admin0);  
		adminDAO.update(admin1);
	
	}
	
	
}
