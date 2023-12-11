package entitys;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "options_delegation")
public class OptionsDelegation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	private boolean taskBoard;
	private boolean taskBoardOptions;
	private boolean taskPriority;
	private boolean taskStatus;
	private boolean taskOptions;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	
	
	
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public OptionsDelegation() {
		
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isTaskBoard() {
		return taskBoard;
	}
	public void setTaskBoard(boolean taskBoard) {
		this.taskBoard = taskBoard;
	}
	public boolean isTaskBoardOptions() {
		return taskBoardOptions;
	}
	public void setTaskBoardOptions(boolean taskBoardOptions) {
		this.taskBoardOptions = taskBoardOptions;
	}
	public boolean isTaskPriority() {
		return taskPriority;
	}
	public void setTaskPriority(boolean taskPriority) {
		this.taskPriority = taskPriority;
	}
	public boolean isTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(boolean taskStatus) {
		this.taskStatus = taskStatus;
	}
	public boolean isTaskOptions() {
		return taskOptions;
	}
	public void setTaskOptions(boolean taskOptions) {
		this.taskOptions = taskOptions;
	}
	
	

}
