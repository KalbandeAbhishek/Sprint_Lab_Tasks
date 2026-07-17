package SetterInjectionWithReferenceType.SpringLabDay10_Task2;

public class Employee {
	private String name;
	private int id;
	private Adderss adderss;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setAdderss(Adderss adderss) {
		this.adderss = adderss;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", adderss=" + adderss + "]";
	}
}
