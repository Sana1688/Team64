package launcher;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//doctors view of patient information

public class doctorPatientInfo {
	 private Button myAccountButton;
	 private Button patientInfoButton;
	 private Button calendarButton;
	 private Button perscriptionButton;
	 private Button messageButton;
	 private Button addHealthInfoButton;
	
	public ScrollPane createDoctorPatientInfo()
	{//navigation buttons
			myAccountButton = new Button("My Account");
			myAccountButton.setMinSize(180, 50);
	    	
		    patientInfoButton = new Button("Patient Info");
		    patientInfoButton.setMinSize(180, 50);	        	
		    
		    calendarButton = new Button("Calendar");
		    calendarButton.setMinSize(180, 50);
		
		    perscriptionButton = new Button("Perscription");
		    perscriptionButton.setMinSize(180, 50);
		    
		    messageButton = new Button("Message");
		    messageButton.setMinSize(180, 50);
//		
		
		VBox buttonContainer = new VBox(myAccountButton, patientInfoButton,calendarButton, perscriptionButton, messageButton);
			
		
		ScrollPane scroll = new ScrollPane();
			
		Text patientInfoHeading = new Text("Patient Information");
		patientInfoHeading.setFont(new Font("Arial", 30));
		
		Text patientName = new Text("Bob"); 	//display patient name here
		patientName.setFont(new Font("Arial", 25));
		
	    Label persciptionsLabel = new Label("Current Presciptions");


		TableView patientPerscriptionsTable = new TableView(); //table to show patients prescriptions
	        
	        TableColumn medicationNameCol = new TableColumn("Medication");
	        TableColumn instructionsCol = new TableColumn("Instructions");
	      
	        
	        patientPerscriptionsTable.getColumns().addAll(medicationNameCol, instructionsCol);
	        
	        patientPerscriptionsTable.setFixedCellSize(25);
	        patientPerscriptionsTable.prefHeightProperty().bind(patientPerscriptionsTable.fixedCellSizeProperty().multiply(Bindings.size(patientPerscriptionsTable.getItems()).add(1.01)));
	        patientPerscriptionsTable.minHeightProperty().bind(patientPerscriptionsTable.prefHeightProperty());
	        patientPerscriptionsTable.maxHeightProperty().bind(patientPerscriptionsTable.prefHeightProperty());
	        
	        
	    Label allergyLabel = new Label("Allergies");
	        
		TableView patientAllergiesTable = new TableView(); //table that displays the patients allergies
			        
			TableColumn allergyNameCol = new TableColumn("Medication");
			TableColumn symptomsCol = new TableColumn("Instructions");
			
			patientAllergiesTable.setFixedCellSize(25);
			patientAllergiesTable.prefHeightProperty().bind(patientAllergiesTable.fixedCellSizeProperty().multiply(Bindings.size(patientAllergiesTable.getItems()).add(1.01)));
			patientAllergiesTable.minHeightProperty().bind(patientAllergiesTable.prefHeightProperty());
			patientAllergiesTable.maxHeightProperty().bind(patientAllergiesTable.prefHeightProperty());
	      
	        
			patientAllergiesTable.getColumns().addAll(allergyNameCol, symptomsCol);
		
		Label patientPhoneLabel = new Label("Contact Info:");
		Text patientPhoneNumber = new Text();	//show patients phone number here
		
		Label patientEmailLabel = new Label("Email:");
		Text patientEmail = new Text(); 		//show patients email here
		
		Label patientPharmacyLabel = new Label("Pharmacy:");
		Text patientPharmacy = new Text();		//show patients pharmacy here
		
		
		GridPane patientBasicInfo = new GridPane();
		
		patientBasicInfo.add(patientPhoneLabel, 0, 0, 1, 1);
		patientBasicInfo.add(patientPhoneNumber, 1, 0, 1, 1);
		
		patientBasicInfo.add(patientEmailLabel, 0, 1, 1, 1);
		patientBasicInfo.add(patientEmail, 1, 1, 1, 1);
		
		patientBasicInfo.add(patientPharmacyLabel, 0, 2, 1, 1);
		patientBasicInfo.add(patientPharmacy, 1, 2, 1, 1);
		
		patientBasicInfo.setVgap(15);

	
		addHealthInfoButton = new Button("Add Health Information"); //add button

		
		VBox patientInfoScreen = new VBox(patientInfoHeading, patientName, persciptionsLabel, patientPerscriptionsTable, allergyLabel, patientAllergiesTable, patientBasicInfo, addHealthInfoButton);
		patientInfoScreen.setSpacing(5);
		
		patientInfoScreen.setMargin(patientBasicInfo, new Insets(20, 0, 20, 10));
		patientInfoScreen.setMargin(addHealthInfoButton, new Insets(20, 0, 20, 250));


		
		Separator screenSplitter = new Separator();
		screenSplitter.setOrientation(Orientation.VERTICAL);
		screenSplitter.setPrefHeight(80);
	
	
		HBox screenSplit = new HBox(buttonContainer,screenSplitter, patientInfoScreen);
				
		Pane pane = new Pane();
		pane.getChildren().addAll(screenSplit);
		
		
		scroll.setContent(pane);
		scroll.pannableProperty().set(true);
    	return scroll;			
		
	}
	
		public void setmyAccountButtonDoctor(Stage stage, Scene doctorViewScene) 
		{
			myAccountButton.setOnAction(e -> stage.setScene(doctorViewScene));   
		}
		
		public void setCalendarButton(Stage stage, Scene DoctorCalendarScene) {
			calendarButton.setOnAction(e -> stage.setScene(DoctorCalendarScene));  
		}
		
		public void setperscriptionButton(Stage stage, Scene DoctorPerscriptionScene) {
			perscriptionButton.setOnAction(e -> stage.setScene(DoctorPerscriptionScene));  
		}
		
		public void setMessageButton(Stage stage, Scene DoctorMessagesViewScene) {
			messageButton.setOnAction(e -> stage.setScene(DoctorMessagesViewScene));  
		}
		
		public void setAddHealthInfoButton(Stage stage, Scene AddHealthInfoViewScene) {
			addHealthInfoButton.setOnAction(e -> stage.setScene(AddHealthInfoViewScene));  
		}
		
		
		
	}
