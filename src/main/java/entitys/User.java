package entitys;

import java.util.List;

public class User {
	
	private long userId;
	private String userName;
	private DelegationOptions delegationsOptions;
	private List<Task> tasksList;
	private List<TaskBoard> taskBoardList;
	
	
	
	public User() {
		super();
	}



	public long getUserId() {
		return userId;
	}



	public void setUserId(long userId) {
		this.userId = userId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public DelegationOptions getDelegationsOptions() {
		return delegationsOptions;
	}



	public void setDelegationsOptions(DelegationOptions delegationsOptions) {
		this.delegationsOptions = delegationsOptions;
	}



	public List<Task> getTasksList() {
		return tasksList;
	}



	public void setTasksList(List<Task> tasksList) {
		this.tasksList = tasksList;
	}



	public List<TaskBoard> getTaskBoardList() {
		return taskBoardList;
	}



	public void setTaskBoardList(List<TaskBoard> taskBoardList) {
		this.taskBoardList = taskBoardList;
	}
	
	
	
	
	

}
