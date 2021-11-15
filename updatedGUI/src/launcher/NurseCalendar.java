package launcher;


import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
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

public class NurseCalendar {
	private Button myAccountButton;
	private Button patientInfoButton;
	private Button calendarButton;
	private Button messageButton;
	private Button addInfo;

	
	public HBox createNurseCalendar()
	{
		myAccountButton = new Button("My Account");
        myAccountButton.setMinSize(180, 50);
    	
	    patientInfoButton = new Button("Patient Info");
	    patientInfoButton.setMinSize(180, 50);	        	
//    	medicalRecordsPatient.setOnAction(e -> stage.setScene(scene3));   
	    
	    calendarButton = new Button("Calendar");
	    calendarButton.setMinSize(180, 50);
//    	appointmentsButtonPatient.setOnAction(e -> stage.setScene(scene4));   
	    
	    messageButton = new Button("Message");
	    messageButton.setMinSize(180, 50);
//	    messageButtonPatient.setOnAction(e -> stage.setScene(scene5)); 
	    
	    addInfo = new Button("Add Info");
	    addInfo.setMinSize(180, 50);

	

	    VBox buttonContainerA = new VBox(myAccountButton, patientInfoButton,calendarButton, addInfo, messageButton);
    	
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

        Separator screenSplitter = new Separator();
		screenSplitter.setOrientation(Orientation.VERTICAL);
		screenSplitter.setPrefHeight(500);

    	HBox calendarsPane = new HBox(buttonContainerA,screenSplitter,calendarVBox);
    	return calendarsPane;
	}
	
	public void setmyAccountButtonNurse(Stage stage, Scene NurseMyAccountScene) 
	{
		myAccountButton.setOnAction(e -> stage.setScene(NurseMyAccountScene));   
	}
	
	public void setpatientInfoButton(Stage stage, Scene NursePatientInfoScene) 
	{
		patientInfoButton.setOnAction(e -> stage.setScene(NursePatientInfoScene));   
	}
	
	public void setaddInfo(Stage stage, Scene NurseAddInfoScene) {
		addInfo.setOnAction(e -> stage.setScene(NurseAddInfoScene));  
	}
	
	public void setMessageButton(Stage stage, Scene NurseMessageScene) {
		messageButton.setOnAction(e -> stage.setScene(NurseMessageScene));  
	}
	

}
