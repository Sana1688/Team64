package launcher;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NurseMyAccount {
	 private Button myAccountButtonNurse;
	 private Button patientInfoButton;
	 private Button calendarButton;
	 private Button perscriptionButton;

	 private Button messageButton;
	 private Button addInfo;
	 
	public Pane createNurseMyAccount()
	{
		myAccountButtonNurse = new Button("My Account");
		myAccountButtonNurse.setMinSize(180, 50);
    	
	    patientInfoButton = new Button("Patient Info");
	    patientInfoButton.setMinSize(180, 50);	        	
//    	medicalRecordsPatient.setOnAction(e -> stage.setScene(scene3));   
	    
	    calendarButton = new Button("Calendar");
	    calendarButton.setMinSize(180, 50);
//    	appointmentsButtonPatient.setOnAction(e -> stage.setScene(scene4));   
	
	    addInfo = new Button("Add Info");
	    addInfo.setMinSize(180, 50);
//	    messageButtonPatient.setOnAction(e -> stage.setScene(scene5));   
	    
	    messageButton = new Button("Message");
	    messageButton.setMinSize(180, 50);
//	    messageButtonPatient.setOnAction(e -> stage.setScene(scene5));   
	
	
		VBox buttonContainer = new VBox(myAccountButtonNurse, patientInfoButton,calendarButton, addInfo, messageButton);
		
		
		Text userInfoHeading = new Text("User Information");
		userInfoHeading.setFont(new Font("Arial", 30));
		
		Label firstNameLabel = new Label("First Name");
		TextField firstNameField = new TextField();
		
		Label lastNameLabel = new Label("Last Name");
		TextField lastNameField = new TextField();
		
		Label dobPatient = new Label("Date of Birth");
		DatePicker dobPatientCalendar = new DatePicker();
				dobPatientCalendar.setMaxSize(125, 25);
				
		Label genderPatient = new Label("Gender");
		TextField genderPatientDrop = new TextField();
		
		GridPane userNameGrid = new GridPane();
		
		userNameGrid.add(firstNameLabel, 0, 0, 1, 1);
		userNameGrid.add(firstNameField, 1, 0, 1, 1);
		
		userNameGrid.add(lastNameLabel, 0, 1, 1, 1);
		userNameGrid.add(lastNameField, 1, 1, 1, 1);
		
		userNameGrid.add(dobPatient, 2, 0, 1, 1);
		userNameGrid.add(dobPatientCalendar, 3, 0, 1, 1);
		
		
		userNameGrid.setVgap(5);
		userNameGrid.setHgap(7);
		
		userNameGrid.setMargin(firstNameLabel, new Insets(20, 0, 0, 5)); 
		userNameGrid.setMargin(firstNameField, new Insets(20, 0, 0, 5)); 
		
		userNameGrid.setMargin(dobPatient, new Insets(20, 0, 0, 5)); 
		userNameGrid.setMargin(dobPatientCalendar, new Insets(20, 0, 0, 5)); 
	
		userNameGrid.setMargin(lastNameLabel, new Insets(0, 0, 0, 5));  
		userNameGrid.setMargin(lastNameField, new Insets(0, 0, 0, 5));  
	
		
		Separator separator2 = new Separator();
		separator2.setOrientation(Orientation.HORIZONTAL);
		
		Label contactInfoLabel = new Label("Contact Information");
		contactInfoLabel.setUnderline(true);
		contactInfoLabel.setFont(new Font("Arial", 15));
		
		Label patientPhoneNumberLabel = new Label("Phone Number:");
		TextField patientPhoneNumberText = new TextField();
		
		Label emailLabel = new Label("Email:");
		TextField emailText = new TextField();
		
		GridPane contactGrid = new GridPane();
		
		contactGrid.add(patientPhoneNumberLabel, 0, 0, 1, 1);
		contactGrid.add(patientPhoneNumberText,  1, 0, 1, 1);
		
		contactGrid.add(emailLabel, 0, 1, 1, 1);
		contactGrid.add(emailText, 1, 1, 1, 1);
		
		contactGrid.setVgap(5);
		contactGrid.setHgap(7);
		
		contactGrid.setMargin(patientPhoneNumberLabel, new Insets(5, 0, 0, 10));
		contactGrid.setMargin(patientPhoneNumberText, new Insets(5, 0, 0, 10)); 
	
		contactGrid.setMargin(emailLabel, new Insets(5, 0, 0, 10)); 
		contactGrid.setMargin(emailText, new Insets(5, 0, 0, 10)); 
	
	
		Separator separator1 = new Separator();
		
		
		Label pharmacyInfoLabel = new Label("Pharmacy Information");
		pharmacyInfoLabel.setUnderline(true);
		pharmacyInfoLabel.setFont(new Font("Arial", 15));
		
		
		Label pharamacyLabel = new Label("Pharmacy:");
		TextField pharmacyField = new TextField();
		
		HBox pharmacyHBox = new HBox(pharamacyLabel, pharmacyField);
		pharmacyHBox.setMargin(pharamacyLabel, new Insets(5, 0, 0, 10));
		pharmacyHBox.setMargin(pharmacyField, new Insets(5, 0, 0, 10));
	
		
		Button saveChangesButton = new Button("Save Changes");
	
	
		VBox userInfoScreen = new VBox(userInfoHeading, userNameGrid, separator2, contactInfoLabel, contactGrid,separator1, 
										pharmacyInfoLabel, pharmacyHBox, saveChangesButton);
		userInfoScreen.setSpacing(10);
		
		userInfoScreen.setMargin(contactInfoLabel, new Insets(5, 0, 0, 150));
		userInfoScreen.setMargin(pharmacyInfoLabel, new Insets(5, 0, 0, 148));
		userInfoScreen.setMargin(saveChangesButton, new Insets(5, 0, 0, 353));
		
		Separator screenSplitter = new Separator();
		screenSplitter.setOrientation(Orientation.VERTICAL);
		screenSplitter.setPrefHeight(500);
	
	
		HBox screenSplit = new HBox(buttonContainer,screenSplitter, userInfoScreen);
				
		Pane pane = new Pane();
		pane.getChildren().addAll(screenSplit);
		
		return pane;
		
	}
	
	
	public void setMessageButton(Stage stage, Scene NurseMessageScene) 
	{
		messageButton.setOnAction(e -> stage.setScene(NurseMessageScene));   
	}
	
	public void setpatientInfoButton(Stage stage, Scene NursePatientInfoScene) 
	{
		patientInfoButton.setOnAction(e -> stage.setScene(NursePatientInfoScene));   
	}
	
	public void setCalendarButton(Stage stage, Scene NurseCalendarScene) {
		calendarButton.setOnAction(e -> stage.setScene(NurseCalendarScene));  
	}
	
	public void setaddInfo(Stage stage, Scene NurseAddInfoScene) {
		addInfo.setOnAction(e -> stage.setScene(NurseAddInfoScene));  
	}
	
}
