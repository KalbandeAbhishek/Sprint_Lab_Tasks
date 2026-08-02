package MixedInjection.SpringLabDay10_Task5;

public class Project {
	private String projectName;
	private int duration;
	private Manager manager;
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", duration=" + duration + ", manager=" + manager + "]";
	}
}
