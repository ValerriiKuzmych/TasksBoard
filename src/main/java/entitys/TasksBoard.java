package entitys;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "tasks_boards")
public class TasksBoard {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tasks_board_id")
    private long tasksBoardId;
	
    @Column(name = "tasks_board_name")
    private String tasksBoardName;
	
	
	
//	@Column (name = "administrator_id")
//	private long adminId;


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

//	public long getAdminId() {
//		return adminId;
//	}
//
//	public void setAdminId(long adminId) {
//		this.adminId = adminId;
//	}

	public String getTasksBoardName() {
		return tasksBoardName;
	}

	public void setTasksBoardName(String tasksBoardName) {
		this.tasksBoardName = tasksBoardName;
	}

}
