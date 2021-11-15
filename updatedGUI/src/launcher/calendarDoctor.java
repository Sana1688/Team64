package launcher;


import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class calendarDoctor {
	private Button myAccountButtonDoctor;
	private Button patientInfoButton;
	private Button calendarButton;
	private Button perscriptionButton;
	private Button messageButton;

	
	public HBox createCalendarDoctor()
	{
		myAccountButtonDoctor = new Button("My Account");
        myAccountButtonDoctor.setMinSize(180, 50);
    	
	    patientInfoButton = new Button("Patient Info");
	    patientInfoButton.setMinSize(180, 50);	        	
//    	medicalRecordsPatient.setOnAction(e -> stage.setScene(scene3));   
	    
	    calendarButton = new Button("Calendar");
	    calendarButton.setMinSize(180, 50);
//    	appointmentsButtonPatient.setOnAction(e -> stage.setScene(scene4));   
	
	    perscriptionButton = new Button("Perscription");
	    perscriptionButton.setMinSize(180, 50);
//	    messageButtonPatient.setOnAction(e -> stage.setScene(scene5));   
	    
	    messageButton = new Button("Message");
	    messageButton.setMinSize(180, 50);
//	    messageButtonPatient.setOnAction(e -> stage.setScene(scene5));   
	

	    VBox buttonContainerA = new VBox(myAccountButtonDoctor, patientInfoButton,calendarButton, perscriptionButton, messageButton);
    	
        Label appointmentsLabel = new Label("Appointments");
        appointmentsLabel.setFont(new Font("Arial", 30));
        
        Label pastAppointmentsLabel = new Label("Past Appointments");
        
        TableView calendarTable = new TableView();
        
        TableColumn dateColumn = new TableColumn("Date");
        TableColumn TimeCol = new TableColumn("Time");
        TableColumn typeCol = new TableColumn("Type");
        TableColumn patientCol = new TableColumn("Patient");


        calendarTable.setFixedCellSize(25);
        calendarTable.prefHeightProperty().bind(calendarTable.fixedCellSizeProperty().multiply(Bindings.size(calendarTable.getItems()).add(1.01)));
        calendarTable.minHeightProperty().bind(calendarTable.prefHeightProperty());
        calendarTable.maxHeightProperty().bind(calendarTable.prefHeightProperty());
        
        calendarTable.getColumns().addAll(dateColumn, TimeCol,typeCol,patientCol);
        
        
        Label totalHours = new Label("Total Hours: ");
        Text hours = new Text();
        
        VBox calendarVBox = new VBox(appointmentsLabel, pastAppointmentsLabel, calendarTable);
    	
        calendarVBox.setMargin(appointmentsLabel, new Insets(20, 0, 0, 10));
        calendarVBox.setMargin(pastAppointmentsLabel, new Insets(20, 0, 0, 10));
        calendarVBox.setMargin(calendarTable, new Insets(5, 0, 0, 10));


    	HBox calendarsPane = new HBox(buttonContainerA,calendarVBox);
    	return calendarsPane;
	}
	
	public void setmyAccountButtonDoctor(Stage stage, Scene doctorViewScene) 
	{
		myAccountButtonDoctor.setOnAction(e -> stage.setScene(doctorViewScene));   
	}
	
	public void setpatientInfoButton(Stage stage, Scene DoctorPatientInfo) 
	{
		patientInfoButton.setOnAction(e -> stage.setScene(DoctorPatientInfo));   
	}
	
	public void setperscriptionButton(Stage stage, Scene DoctorPerscriptionScene) {
		perscriptionButton.setOnAction(e -> stage.setScene(DoctorPerscriptionScene));  
	}
	
	public void setMessageButton(Stage stage, Scene DoctorMessagesViewScene) {
		messageButton.setOnAction(e -> stage.setScene(DoctorMessagesViewScene));  
	}
}
