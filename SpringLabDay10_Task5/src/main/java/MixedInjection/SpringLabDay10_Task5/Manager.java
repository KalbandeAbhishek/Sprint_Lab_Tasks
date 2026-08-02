package MixedInjection.SpringLabDay10_Task5;

public class Manager {
	private String managerName;
	private String department;
	
	public Manager(String managerName, String department) {
		super();
		this.managerName = managerName;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Manager [managerName=" + managerName + ", department=" + department + "]";
	}
}
