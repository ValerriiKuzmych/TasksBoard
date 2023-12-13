package eclipseTasksBoard;

import entitys.Administrator;
import entitys.TasksBoard;
import entitys.DAO.AdministratorDAO;
import entitys.DAO.TasksBoardDAO;

public class Main {
	
	public static void main(String[] args) {
		
		Administrator admin0 = new Administrator();
		
		AdministratorDAO adminDAO = new AdministratorDAO();
		
		adminDAO.add(admin0);
		
		TasksBoard tasksBoard0 = new TasksBoard();
		
		
		TasksBoardDAO tasksBoardDAO = new TasksBoardDAO();
		
		tasksBoardDAO.add(tasksBoard0);
		
		
	
	}
	
	
}
