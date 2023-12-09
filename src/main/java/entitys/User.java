package entitys;



import javax.persistence.CascadeType;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "users")

public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    
    
    private String firstName;
    private String lastName;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "options_delegation_id")
    private OptionsDelegation optionsDelegation;
//	private List<Task> tasksList;
//	private List<TaskBoard> taskBoardList;
	
	
	
	public User() {
		
	}



	public long getUserId() {
		return userId;
	}



	public void setUserId(long userId) {
		this.userId = userId;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}



	public OptionsDelegation getOptionsDelegations() {
		return optionsDelegation;
	}



	public void setOptionsDelegations(OptionsDelegation optionsDelegations) {
		this.optionsDelegation = optionsDelegations;
	}







//
//
//
//	public List<Task> getTasksList() {
//		return tasksList;
//	}
//
//
//
//	public void setTasksList(List<Task> tasksList) {
//		this.tasksList = tasksList;
//	}
//
//
//
//	public List<TaskBoard> getTaskBoardList() {
//		return taskBoardList;
//	}
//
//
//
//	public void setTaskBoardList(List<TaskBoard> taskBoardList) {
//		this.taskBoardList = taskBoardList;
//	}
//	
	
	
	
	

}
