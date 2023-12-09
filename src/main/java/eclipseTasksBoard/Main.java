package eclipseTasksBoard;

import entitys.User;
import entitys.DAO.UserDAO;
import entitys.OptionsDelegation;

public class Main {
	
	public static void main(String[] args) {
		
		
		User user = new User();
		OptionsDelegation optionDelegationUser = new OptionsDelegation();
		optionDelegationUser.setTaskStatus(true);
		optionDelegationUser.setTaskOptions(true);
		user.setFirstName("Ivan");
		user.setLastName("Poddubniy");
		optionDelegationUser.setUser(user);
		user.setOptionsDelegations(optionDelegationUser);
		
		
		User user1 = new User();
		OptionsDelegation optionDelegationUser1 = new OptionsDelegation();
		optionDelegationUser1.setTaskBoard(true);
		optionDelegationUser1.setTaskBoardOptions(true);
		optionDelegationUser1.setTaskOptions(true);
		optionDelegationUser1.setTaskStatus(true);
		optionDelegationUser1.setTaskStatus(true);
		user1.setFirstName("Nikita");
		user1.setLastName("Nikiforov");
		optionDelegationUser1.setUser(user1);
		user1.setOptionsDelegations(optionDelegationUser1);
		
		
		
		
		UserDAO userDAO = new UserDAO();
		
		
		
     	userDAO.add(user);
		userDAO.add(user1);
		System.out.println(userDAO.findById(1)); 
		System.out.println(userDAO.findById(2));
		
		
	}
	
	
}
