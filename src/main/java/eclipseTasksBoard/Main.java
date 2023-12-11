package eclipseTasksBoard;

import entitys.User;
import entitys.DAO.UserDAO;

import java.util.ArrayList;

import entitys.OptionsDelegation;
import entitys.Task;

public class Main {
	
	public static void main(String[] args) {
		
		
		User user = new User();
		OptionsDelegation optionDelegationUser = new OptionsDelegation();
		Task task =  new Task();
		optionDelegationUser.setTaskStatus(true);
		optionDelegationUser.setTaskOptions(true);
		task.setTaskPriority("Normal");
		task.setTaskStatus("New");	
		user.setFirstName("Ivan");
		user.setLastName("Poddubniy");
		optionDelegationUser.setUser(user);
		user.setOptionsDelegations(optionDelegationUser);
		task.setUser(user);
		
		
		ArrayList<Task> tasks =  new ArrayList<>();
		tasks.add(task);
		user.setTasksList(tasks);
		
		
		User user1 = new User();
		OptionsDelegation optionDelegationUser1 = new OptionsDelegation();
		Task task1 =  new Task();
		Task task2 =  new Task();
		optionDelegationUser1.setTaskBoard(true);
		optionDelegationUser1.setTaskBoardOptions(true);
		optionDelegationUser1.setTaskOptions(true);
		optionDelegationUser1.setTaskStatus(true);
		optionDelegationUser1.setTaskStatus(true);
		task1.setTaskPriority("Normal");
		task1.setTaskStatus("New");			
		user1.setFirstName("Nikita");
		user1.setLastName("Nikiforov");
		optionDelegationUser1.setUser(user1);
		task1.setUser(user1);
		task2.setUser(user1);
		user1.setOptionsDelegations(optionDelegationUser1);
		
		ArrayList<Task> tasks1 =  new ArrayList<>();
		tasks1.add(task1);
		tasks1.add(task2);
		user1.setTasksList(tasks1);
		
		
		
		
		UserDAO userDAO = new UserDAO();
		
		
		
     	userDAO.add(user);
		userDAO.add(user1);
		System.out.println(userDAO.findById(1)); 
		System.out.println(userDAO.findById(2));
		
		
	}
	
	
}
