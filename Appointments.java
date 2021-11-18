//Set up the data type needs to be implemented with data writing to store appointment data

//this allows for using the patients name when writing to file
public class Appointments extends Patient
{
    private String appDate;
    private String appReason;
    private String appDoctor;
  
    public void setAppDate(String ad) {
       appDate = ad;
    }  
  
    public void setAppReason(String ar) {
        appReason = ar;
    }
  
    public void setAppReason(String adr) {
        appDoctor = adr;
    }
  
    //writes the variables to text file to save patient appointments
    public void writeApptoFile()
    {
      
    }
  
}
