package ConstructorInjectionWithReferenceType.SpringLabDay10_Task4;

public class Doctor {
	private String docName;
	private String specialization;
	
	public Doctor(String docName, String specialization) {
		super();
		this.docName = docName;
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor [docName=" + docName + ", specialization=" + specialization + "]";
	}
}
