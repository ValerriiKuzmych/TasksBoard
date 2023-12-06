package eclipseTasksBoard;

import entitys.User;
import entitys.DAO.UserDAO;

public class Main {
	
	public static void main(String[] args) {
		
		
		User user = new User();	
		user.setUserName("Ivan");
		
		
		UserDAO userDAO = new UserDAO();
		
		
		
		userDAO.add(user);
		
		
	}
}
