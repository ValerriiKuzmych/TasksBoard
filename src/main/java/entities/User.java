package entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "users")

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;

	private String firstName;
	private String lastName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "options_delegation_id")
	private OptionsDelegation optionsDelegation;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Task> tasksList;

	@ManyToMany(mappedBy = "usersList", cascade = CascadeType.ALL)
	private List<TasksBoard> tasksBoardsList;

	public User() {

	}

	public OptionsDelegation getOptionsDelegation() {
		return optionsDelegation;
	}

	public void setOptionsDelegation(OptionsDelegation optionsDelegation) {
		this.optionsDelegation = optionsDelegation;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public List<Task> getTasksList() {
		return tasksList;
	}

	public void setTasksList(List<Task> tasksList) {
		this.tasksList = tasksList;
	}

	public List<TasksBoard> getTasksBoardsList() {
		return tasksBoardsList;
	}

	public void setTasksBoardsList(List<TasksBoard> tasksBoardsList) {
		this.tasksBoardsList = tasksBoardsList;
	}

}
