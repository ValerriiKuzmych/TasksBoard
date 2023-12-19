package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "tasks")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long taskId;

	@ManyToOne
	@JoinColumn(name = "administrator_id")
	private Administrator administrator;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "tasks_board_id")
	private TasksBoard tasksBoard;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "task_priority")
	private TaskPriority taskPriority;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "task_status")
	private TaskStatus taskStatus;

	public Task() {
		super();
	}

	public Administrator getAdministrator() {
		return administrator;
	}

	public void setAdministrator(Administrator administrator) {
		this.administrator = administrator;
	}

	public TasksBoard getTasksBoard() {
		return tasksBoard;
	}

	public void setTasksBoard(TasksBoard tasksBoard) {
		this.tasksBoard = tasksBoard;
	}

	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public TaskPriority getTaskPriority() {
		return taskPriority;
	}

	public void setTaskPriority(TaskPriority taskPriority) {
		this.taskPriority = taskPriority;
	}

	public TaskStatus getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	};
	
}
