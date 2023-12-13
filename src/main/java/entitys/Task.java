package entitys;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
(name = "tasks")
public class Task {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long taskId;
	
	 @ManyToOne
	 @JoinColumn(name = "user_id")
	 private User user;
	 
	 
	 private TasksBoard tasksBoard;
	 
	 
//	private long taskBoardId;
//
//    private long adminId;
	
	private String taskStatus;
	
	private String taskPriority;
	
	
	

	public Task() {
		super();
	}
	
	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(String taskPriority) {
		this.taskPriority = taskPriority;
	}

	public TasksBoard getTaskBoard() {
		return tasksBoard;
	}

	public void setTaskBoard(TasksBoard tasksBoard) {
		this.tasksBoard = tasksBoard;
	}
	
	
	
	
	

}
