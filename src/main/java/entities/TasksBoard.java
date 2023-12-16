package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tasks_boards")
public class TasksBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tasks_board_id")
	private long tasksBoardId;

	@Column(name = "tasks_board_name")
	private String tasksBoardName;

	@ManyToOne
	@JoinColumn(name = "admin_id")
	private Administrator administrator;

//	private List<User> usersList;
//
//
//	private List<Task> tasksList;

	public TasksBoard() {
		super();
	}

	public long getTasksBoardId() {
		return tasksBoardId;
	}

	public void setTasksBoardId(long taskBoardId) {
		this.tasksBoardId = taskBoardId;
	}

//	public List<User> getUsersList() {
//		return usersList;
//	}
//
//	public void setUsersList(List<User> usersList) {
//		this.usersList = usersList;
//	}
//
//	public List<Task> getTasksList() {
//		return tasksList;
//	}
//
//	public void setTasksList(List<Task> tasksList) {
//		this.tasksList = tasksList;
//	}


	public String getTasksBoardName() {
		return tasksBoardName;
	}

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public void setTasksBoardName(String tasksBoardName) {
		this.tasksBoardName = tasksBoardName;
	}

}
