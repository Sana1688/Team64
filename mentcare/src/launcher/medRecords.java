package launcher;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


//Patients Medical Records

public class medRecords {
	private Button myAccountButtonPatientMR;
	private Button medicalRecordsPatientMR;
	private Button appointmentsButtonPatientMR;
	private Button messageButtonPatientMR;
	
	public HBox createMedRecords(Stage primaryStage, Scene scene2, Scene scene3, Scene scene4, Scene scene5)
	{
        Label medicalRecordsLabel = new Label("Medical Records");
        medicalRecordsLabel.setFont(new Font("Arial", 25));

        
        Label currentPerscriptionsLabel = new Label("Current Perscriptions");
        
        TableView recordsTable = new TableView(); //table for displaying patient their prescriptions
        
        TableColumn medicationNameCol = new TableColumn("Medication");
        TableColumn instructionsCol = new TableColumn("Instructions");
      
        
        recordsTable.getColumns().addAll(medicationNameCol, instructionsCol);
        
        
        VBox medicalRecordsVBox = new VBox(medicalRecordsLabel, currentPerscriptionsLabel, recordsTable);
    	
        medicalRecordsVBox.setMargin(medicalRecordsLabel, new Insets(5, 0, 0, 10));
        medicalRecordsVBox.setMargin(currentPerscriptionsLabel, new Insets(40, 0, 0, 20));
        medicalRecordsVBox.setMargin(recordsTable, new Insets(10, 0, 0, 25));
        
        
//navigation buttons
        myAccountButtonPatientMR = new Button("My Account");
    	myAccountButtonPatientMR.setMinSize(180, 50);

    	
    	medicalRecordsPatientMR = new Button("Medical Records");
    	medicalRecordsPatientMR.setMinSize(180, 50);	        	
    
    	appointmentsButtonPatientMR = new Button("Appointments");
    	appointmentsButtonPatientMR.setMinSize(180, 50);
    	
    	messageButtonPatientMR = new Button("Message");
    	messageButtonPatientMR.setMinSize(180, 50);
//

    	VBox buttonContainerMR = new VBox(myAccountButtonPatientMR, medicalRecordsPatientMR, appointmentsButtonPatientMR, messageButtonPatientMR);
        
    	recordsTable.setFixedCellSize(25);
    	recordsTable.prefHeightProperty().bind(recordsTable.fixedCellSizeProperty().multiply(Bindings.size(recordsTable.getItems()).add(1.01)));
    	recordsTable.minHeightProperty().bind(recordsTable.prefHeightProperty());
    	recordsTable.maxHeightProperty().bind(recordsTable.prefHeightProperty());

    	HBox medicalRecordsPane = new HBox(buttonContainerMR, medicalRecordsVBox);
    	
    	return medicalRecordsPane;
	}
	
	public void setMyAccountAction(Stage stage, Scene scene2) 
	{
		myAccountButtonPatientMR.setOnAction(e -> stage.setScene(scene2));   
	}
	
	public void setApptAction(Stage stage, Scene scene4) 
	{
		appointmentsButtonPatientMR.setOnAction(e -> stage.setScene(scene4));   
	}
	
	public void setMssgAction(Stage stage, Scene scene5) {
		messageButtonPatientMR.setOnAction(e -> stage.setScene(scene5)); 
	}
}
