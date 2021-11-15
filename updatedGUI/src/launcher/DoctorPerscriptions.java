package launcher;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DoctorPerscriptions {
	 private Button myAccountButtonDoctor;
	 private Button patientInfoButton;
	 private Button calendarButton;
	 private Button perscriptionButton;
	 private Button messageButton;
	 private Button orderPerscriptionButton;
	
	public HBox createDoctorPerscriptions()
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
	    
	    
		VBox buttonContainer = new VBox(myAccountButtonDoctor, patientInfoButton,calendarButton, perscriptionButton, messageButton);

        Label percsriptionsOrderLabel = new Label("Perscriptions");
        percsriptionsOrderLabel.setFont(new Font("Arial", 25));

                
        TableView perscriptionsOrderTable = new TableView();
        
        TableColumn recieveDateCol = new TableColumn("Receive");
        TableColumn orderDateCol = new TableColumn("Order");
        TableColumn locationCol = new TableColumn("Location");
        TableColumn medNameCol = new TableColumn("Name");
      
        
        perscriptionsOrderTable.getColumns().addAll(recieveDateCol,orderDateCol,locationCol,medNameCol);
        
        orderPerscriptionButton = new Button("Order Perscription");
        
        VBox medicalRecordsVBox = new VBox(percsriptionsOrderLabel, perscriptionsOrderTable,orderPerscriptionButton);
            	
        medicalRecordsVBox.setMargin(percsriptionsOrderLabel, new Insets(20, 0, 0, 10));
        medicalRecordsVBox.setMargin(perscriptionsOrderTable, new Insets(30, 0, 0, 25));
        medicalRecordsVBox.setMargin(orderPerscriptionButton, new Insets(260, 0, 0, 310));

        

        perscriptionsOrderTable.setFixedCellSize(25);
        perscriptionsOrderTable.prefHeightProperty().bind(perscriptionsOrderTable.fixedCellSizeProperty().multiply(Bindings.size(perscriptionsOrderTable.getItems()).add(1.01)));
        perscriptionsOrderTable.minHeightProperty().bind(perscriptionsOrderTable.prefHeightProperty());
        perscriptionsOrderTable.maxHeightProperty().bind(perscriptionsOrderTable.prefHeightProperty());

    	HBox perscriptionsRecordsPane = new HBox(buttonContainer, medicalRecordsVBox);    	

        
                
        return perscriptionsRecordsPane;
	}
	
	public void setmyAccountButtonDoctor(Stage stage, Scene doctorViewScene) 
	{
		myAccountButtonDoctor.setOnAction(e -> stage.setScene(doctorViewScene));   
	}
	
	public void setpatientInfoButton(Stage stage, Scene DoctorPatientInfo) 
	{
		patientInfoButton.setOnAction(e -> stage.setScene(DoctorPatientInfo));   
	}
	
	public void setCalendarButton(Stage stage, Scene DoctorCalendarScene) {
		calendarButton.setOnAction(e -> stage.setScene(DoctorCalendarScene));  
	}
	
	
	public void setMessageButton(Stage stage, Scene DoctorMessagesViewScene) {
		messageButton.setOnAction(e -> stage.setScene(DoctorMessagesViewScene));  
	}	
	
	
	public void setorderPerscriptionButton(Stage stage, Scene AddOrderViewPaneScene) {
		orderPerscriptionButton.setOnAction(e -> stage.setScene(AddOrderViewPaneScene));  
	}	
	
	
	
	
}
