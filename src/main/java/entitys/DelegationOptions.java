package entitys;

public class DelegationOptions {
	
	
	private long userId; 
	private boolean taskBoard;
	private boolean taskBoardOptions;
	private boolean taskPriority;
	private boolean taskStatus;
	private boolean taskOptions;
	
	
	
	public DelegationOptions() {
		super();
	}
	
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public boolean isTaskBoard() {
		return taskBoard;
	}
	public void setTaskBoard(boolean taskBoard) {
		this.taskBoard = taskBoard;
	}
	public boolean isTaskBoardOptions() {
		return taskBoardOptions;
	}
	public void setTaskBoardOptions(boolean taskBoardOptions) {
		this.taskBoardOptions = taskBoardOptions;
	}
	public boolean isTaskPriority() {
		return taskPriority;
	}
	public void setTaskPriority(boolean taskPriority) {
		this.taskPriority = taskPriority;
	}
	public boolean isTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(boolean taskStatus) {
		this.taskStatus = taskStatus;
	}
	public boolean isTaskOptions() {
		return taskOptions;
	}
	public void setTaskOptions(boolean taskOptions) {
		this.taskOptions = taskOptions;
	}
	
	

}
