import Appointments;
//Contains all atributes about the patient and allows said
//information to be changes, can also return appointments for patient
//from the appointments class
public class Patient
{
	private String name;
	private String email;
	private String vitals;
	private String prescription;
	private int phoneNum;
	
	public Appointments apps;
	
  //TEMP, will get appointments for patient from Appointments class when that class is fully implemented
  public void getAppointments() {
    apps.toString(name);
  }
	
	//getters and setters for all patient information
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getVitals() {
		return vitals;
	}
	
	public String getPrescription() {
		return prescription;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setName(String n) {
		 name = n;
	}
	
	public void setEmail(String e) {
		 email = e;
	}
	
	public void setVitals(String v) {
		 vitals = v;
	}
	
	public void setPrescription(String p) {
		 prescription = p;
	}
	
	public void setPhoneNum(int pn) {
		 phoneNum = pn;
	}
	
}
