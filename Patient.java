import Appointments;
//Contains all attributes about the patient and allows said
//information to be changes, can also return appointments for patient
//from the appointments class
public class Patient
{
	private String firstName;
	private String lastName;
	private String email;
	private String vitals;
	private String prescription;
	private int DOB; //date of birth in MMDDYY 
	private int phoneNum;
	
	public Appointments apps;
	
  //TEMP, will get appointments for patient from Appointments class when that class is fully implemented
  public void getAppointments() {
    apps.toString(firstName, lastName);
  }
	
	//getters and setters for all patient information
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
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
	
	public int getDOB() {
		return DOB;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public void setFirstName(String fn) {
		 firstName = fn;
	}
	
	public void setLastName(String ln) {
		lastName = ln
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
	
	public void setDOB(int d) {
		 DOB = d;
	}
	
	public void setPhoneNum(int pn) {
		 phoneNum = pn;
	}
	
}
