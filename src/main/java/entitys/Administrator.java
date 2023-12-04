package entitys;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
