package entities;



public class TaskPriority {
	

	private long taskId;
	private boolean lowPriority;
	private boolean mediumPriority;
	private boolean highPriority;
	private boolean superHighPriority;
	
	
	
	public TaskPriority() {
		super();
	}
	
	
	
	public long getTaskId() {
		return taskId;
	}
	public void setTaskId(long taskId) {
		this.taskId = taskId;
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
