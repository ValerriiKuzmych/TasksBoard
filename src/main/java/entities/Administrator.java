package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "administrators")
public class Administrator {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "admin_id")
	private long adminId;
	@Column(name = "admin_name")
	private String userName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "general_panel_id")
	private GeneralPanel generalPanel;

	@OneToMany(mappedBy = "administrator", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Task> tasksList;

	@OneToMany(mappedBy = "administrator", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TasksBoard> tasksBoardsList;

	public Administrator() {
		super();
	}

	public GeneralPanel getGeneralPanel() {
		return generalPanel;
	}

	public void setGeneralPanel(GeneralPanel generalPanel) {
		this.generalPanel = generalPanel;
	}

	public List<Task> getTasksList() {
		return tasksList;
	}

	public void setTasksList(List<Task> tasksList) {
		this.tasksList = tasksList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<TasksBoard> getTasksBoardsList() {
		return tasksBoardsList;
	}

	public void setTasksBoardsList(List<TasksBoard> tasksBoardsList) {
		this.tasksBoardsList = tasksBoardsList;
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public List<TasksBoard> getTaskBoardsList() {
		return tasksBoardsList;
	}

	public void setTaskBoardList(List<TasksBoard> tasksBoardsList) {
		this.tasksBoardsList = tasksBoardsList;
	}

}
