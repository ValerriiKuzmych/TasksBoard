package entitys;

import java.util.List;

public class Administrator {
	
	private long adminId;
	private String userName;
	private List<Task> tasksList;
	private List<TaskBoard> taskBoardList;
	
	
	
	public Administrator() {
		super();
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
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


	public long getAdminId() {
		return adminId;
	}




	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	
	
	

}