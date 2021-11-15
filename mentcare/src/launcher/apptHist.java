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
import javafx.stage.Stage;

public class apptHist {
	private Button myAccountButtonPatientA;
	private Button medicalRecordsPatientA;
	private Button appointmentsButtonPatientA;
	private Button messageButtonPatientA;
	
	//Patients Appointment history
	
	public HBox createAppHist()
	{
		//navigation buttons
		myAccountButtonPatientA = new Button("My Account");  
    	myAccountButtonPatientA.setMinSize(180, 50);
    	
    	medicalRecordsPatientA = new Button("Medical Records");
    	medicalRecordsPatientA.setMinSize(180, 50);

    
    	appointmentsButtonPatientA = new Button("Appointments");
    	appointmentsButtonPatientA.setMinSize(180, 50);   

    	
    	messageButtonPatientA = new Button("Message");
    	messageButtonPatientA.setMinSize(180, 50);
//

	    VBox buttonContainerA = new VBox(myAccountButtonPatientA, medicalRecordsPatientA,appointmentsButtonPatientA, messageButtonPatientA);
    	
        Label appointmentsLabel = new Label("Appointments");
        appointmentsLabel.setFont(new Font("Arial", 30));
        
        Label pastAppointmentsLabel = new Label("Past Appointments");
        
        TableView appointmentsTable = new TableView(); //table for displaying all appointments the patient has had
        
        TableColumn dateColumn = new TableColumn("Date");
        TableColumn TimeCol = new TableColumn("Time");
        TableColumn reasonCol = new TableColumn("Reason");
        TableColumn doctorCol = new TableColumn("Doctor");


        appointmentsTable.setFixedCellSize(25);
        appointmentsTable.prefHeightProperty().bind(appointmentsTable.fixedCellSizeProperty().multiply(Bindings.size(appointmentsTable.getItems()).add(1.01)));
        appointmentsTable.minHeightProperty().bind(appointmentsTable.prefHeightProperty());
        appointmentsTable.maxHeightProperty().bind(appointmentsTable.prefHeightProperty());
        
        appointmentsTable.getColumns().addAll(dateColumn, TimeCol,reasonCol,doctorCol);
        
        
        VBox appointmentsVBox = new VBox(appointmentsLabel, pastAppointmentsLabel, appointmentsTable);
    	
        appointmentsVBox.setMargin(appointmentsLabel, new Insets(20, 0, 0, 10));
        appointmentsVBox.setMargin(pastAppointmentsLabel, new Insets(20, 0, 0, 10));
        appointmentsVBox.setMargin(appointmentsTable, new Insets(5, 0, 0, 10));


    	HBox appointmentsPane = new HBox(buttonContainerA,appointmentsVBox);
    	return appointmentsPane;
	}
	
	
	public void setMyAccountAction(Stage stage, Scene scene2) 
	{
		myAccountButtonPatientA.setOnAction(e -> stage.setScene(scene2));   
	}
	
	public void setMedRecordsAction(Stage stage, Scene scene3) 
	{
		medicalRecordsPatientA.setOnAction(e -> stage.setScene(scene3));   
	}
	
	public void setApptAction(Stage stage, Scene scene4) 
	{
		appointmentsButtonPatientA.setOnAction(e -> stage.setScene(scene4));   
	}
	
	public void setMssgAction(Stage stage, Scene scene5) {
		messageButtonPatientA.setOnAction(e -> stage.setScene(scene5));  
	}
}
