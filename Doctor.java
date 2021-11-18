//contains outline data for all doctors

public class Doctor
{
	private String firstName;
	private String lastName;
	private String email;
	private int employeeID;
	private int phoneNum;
	
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
		
		
		public int getPhoneNum() {
			return phoneNum;
		}
		
		public void setFirstName(String fn) {
			 firstName = fn;
		}
		
		public void setLastName(String ln) {
			 lastName = ln;
		}
		
		public void setEmail(String e) {
			 email = e;
		}
		
		
		public void setPhoneNum(int pn) {
			 phoneNum = pn;
		}
}
