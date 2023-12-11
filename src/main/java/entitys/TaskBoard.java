package entitys;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TaskBoard {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long taskBoardId;
//	private long adminId;
	
	@ManyToMany(mappedBy = "tasksBoardsList")
	
	private List<User> usersList;
//	private List<Task> tasksList;
//	
	
	
	public TaskBoard() {
		super();
	}
	
	
	
	public long getTaskBoardId() {
		return taskBoardId;
	}
	public void setTaskBoardId(long taskBoardId) {
		this.taskBoardId = taskBoardId;
	}
//	public long getAdminId() {
//		return adminId;
//	}
//	public void setAdminId(long adminId) {
//		this.adminId = adminId;
//	}
	public List<User> getUsersList() {
		return usersList;
	}
	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}
//	public List<Task> getTasksList() {
//		return tasksList;
//	}
//	public void setTasksList(List<Task> tasksList) {
//		this.tasksList = tasksList;
//	}
	
	
	

}
