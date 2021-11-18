//contains outline and data for all nurses, as of now is the same as doctor

public class Nurse
{
	private String firstName;
	private String lastName;
	private String email;
	private int DOB;
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

		public int getDOB() {
			return DOB;
		}
	
		public int getEmployeeID() {
			return employeeID;
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
	
		public void setDOB(int d) {
		 DOB = d;
		}
	
		public void setEmployeeID(int id) {
			 employeeID = id;
		}
}
