package SetterInjectionWithReferenceType.SpringLabDay10_Task2;

public class Adderss {
	private String city;
	private int pincode;
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Adderss [city=" + city + ", pincode=" + pincode + "]";
	}
}
