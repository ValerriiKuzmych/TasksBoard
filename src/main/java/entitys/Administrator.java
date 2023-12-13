package entitys;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
(name = "administrators")
public class Administrator {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="admin_id")
	private long adminId;
	@Column(name ="admin_name")
	private String userName;
//	private List<Task> tasksList;
//	private List<TasksBoard> taskBoardList;
	
	
	
	public Administrator() {
		super();
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


//	public List<Task> getTasksList() {
//		return tasksList;
//	}
//
//
//	public void setTasksList(List<Task> tasksList) {
//		this.tasksList = tasksList;
//	}
//
//
//	public List<TasksBoard> getTaskBoardList() {
//		return taskBoardList;
//	}
//
//
//	public void setTaskBoardList(List<TasksBoard> taskBoardList) {
//		this.taskBoardList = taskBoardList;
//	}


	public long getAdminId() {
		return adminId;
	}




	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}
	
	
	

}
