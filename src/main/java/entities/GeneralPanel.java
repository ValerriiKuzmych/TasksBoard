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

@Entity(name = "general_panels")
public class GeneralPanel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "general_panels_id")
	long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "administrators_id")
	private Administrator admin;
	
	@OneToMany(mappedBy = "generalPanel", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TasksBoard> tasksBoardsList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Administrator getAdmin() {
		return admin;
	}

	public void setAdmin(Administrator admin) {
		this.admin = admin;
	}

	public List<TasksBoard> getTasksBoardsList() {
		return tasksBoardsList;
	}

	public void setTasksBoardsList(List<TasksBoard> tasksBoardsList) {
		this.tasksBoardsList = tasksBoardsList;
	}

	
}
