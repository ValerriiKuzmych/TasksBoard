package eclipseTasksBoard;

import entitys.User;
import entitys.DAO.UserDAO;

public class Main {
	
	public static void main(String[] args) {
		
		
		User user = new User();	
		user.setFirstName("Ivan");
		user.setLastName("Poddubniy");
		
		User user1 = new User();	
		user1.setFirstName("Nikita");
		user1.setLastName("Nikiforov");
		
		
		
		UserDAO userDAO = new UserDAO();
		
		
		
     	userDAO.add(user);
		userDAO.add(user1);
		System.out.println(userDAO.findById(1)); 
		System.out.println(userDAO.findById(2));
		
		
	}
	
	
}
