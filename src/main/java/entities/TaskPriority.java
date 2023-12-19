package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name = "task_priorities")
public class TaskPriority {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  
	
	
	@OneToOne(mappedBy = "taskPriority", cascade = CascadeType.ALL)
	private Task task;
	
	private boolean lowPriority;
	private boolean mediumPriority;
	private boolean highPriority;
	private boolean superHighPriority;
	
	
	
	public TaskPriority() {
		super();
	}
	
	
	public boolean isLowPriority() {
		return lowPriority;
	}
	public void setLowPriority(boolean lowPriority) {
		this.lowPriority = lowPriority;
	}
	public boolean isMediumPriority() {
		return mediumPriority;
	}
	public void setMediumPriority(boolean mediumPriority) {
		this.mediumPriority = mediumPriority;
	}
	public boolean isHighPriority() {
		return highPriority;
	}
	public void setHighPriority(boolean highPriority) {
		this.highPriority = highPriority;
	}
	public boolean isSuperHighPriority() {
		return superHighPriority;
	}
	public void setSuperHighPriority(boolean superHighPriority) {
		this.superHighPriority = superHighPriority;
	}
	
	
	
	
	

}
