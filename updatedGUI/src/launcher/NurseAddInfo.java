package launcher;


import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NurseAddInfo {
	private Button myAccountButton;
	private Button patientInfoButton;
	private Button calendarButton;
	private Button messageButton;
	private Button addInfo;

	 
	
	public ScrollPane createNurseAddInfo()
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
	    
	    ScrollPane scroll = new ScrollPane();
  

	    VBox buttonContainerA = new VBox(myAccountButton, patientInfoButton,calendarButton, addInfo, messageButton);
	    
	    
	    Label addInfoHeader = new Label("Add Info");
	    addInfoHeader.setFont(new Font("Arial", 30));
	    
	    
	    Label patientNameLabel = new Label("Patient Name:");
	    TextField patientNameTextField = new TextField();
	    
	    Label weightLabel = new Label("Weight:");
	    TextField weightTextField = new TextField();
	    
	    Label heightLabel = new Label("Height:");
	    TextField heightTextField = new TextField();
	    
	    Label temperatureLabel = new Label("Temperature:");
	    TextField temperatureTextField = new TextField();
	    
	    Label bloodPressureLabel = new Label("Blood Pressure:");
	    TextField bloodPressureTextField = new TextField();
	    bloodPressureTextField.setPrefWidth(50);

	    
	    Label allergensLabel = new Label("Allergens:");
	    TextArea allergensTextField = new TextArea();
	    allergensTextField.setPrefWidth(50);
	    allergensTextField.setPrefHeight(30);

	    
	    Label otherLabel = new Label("Other Info:");
	    TextArea otherTextField = new TextArea();
	    otherTextField.setPrefWidth(70);
	    otherTextField.setPrefHeight(3);


	    
		
	    
	    GridPane addInfoGrid = new GridPane();
		
	    addInfoGrid.add(patientNameLabel, 0, 0, 1, 1);
	    addInfoGrid.add(patientNameTextField, 1, 0, 1, 1);
	    
	    addInfoGrid.add(weightLabel, 0, 1, 1, 1);
	    addInfoGrid.add(weightTextField, 1, 1, 1, 1);
	    
	    addInfoGrid.add(heightLabel, 0, 2, 1, 1);
	    addInfoGrid.add(heightTextField, 1, 2, 1, 1);
	    
	    addInfoGrid.add(temperatureLabel, 0, 3, 1, 1);
	    addInfoGrid.add(temperatureTextField, 1, 3, 1, 1);
	    
	    addInfoGrid.add(bloodPressureLabel, 0, 4, 1, 1);
	    addInfoGrid.add(bloodPressureTextField, 1, 4, 1, 1);
	    
	    addInfoGrid.add(allergensLabel, 0, 5, 1, 1);
	    addInfoGrid.add(allergensTextField, 1, 5, 3, 1);
	    
	    addInfoGrid.add(otherLabel, 0, 6, 1, 1);
	    addInfoGrid.add(otherTextField, 1, 6, 3, 1);
	    
	    addInfoGrid.setVgap(30);
	    addInfoGrid.setHgap(20);

	    
	    Button addInfoUpdateButton = new Button("Update Information");
	    
	    VBox addInfoVBox = new VBox(addInfoHeader,addInfoGrid, addInfoUpdateButton);
	    
	    addInfoVBox.setMargin(addInfoHeader, new Insets(20, 0, 0, 20));
	    addInfoVBox.setMargin(addInfoGrid, new Insets(20, 0, 0, 20));
	    addInfoVBox.setMargin(addInfoUpdateButton, new Insets(20, 0, 20, 200));

	    
	    Separator screenSplitter = new Separator();
		screenSplitter.setOrientation(Orientation.VERTICAL);
		screenSplitter.setPrefHeight(500);
	    
		HBox addInfoPane = new HBox(buttonContainerA,screenSplitter, addInfoVBox);
		
		scroll.setContent(addInfoPane);
		scroll.pannableProperty().set(true);
    	return scroll;
		
	}

	public void setmyAccountButtonNurse(Stage stage, Scene NurseMyAccountScene) 
	{
		myAccountButton.setOnAction(e -> stage.setScene(NurseMyAccountScene));   
	}
	
	public void setpatientInfoButton(Stage stage, Scene NursePatientInfoScene) 
	{
		patientInfoButton.setOnAction(e -> stage.setScene(NursePatientInfoScene));   
	}
	
	
	public void setMessageButton(Stage stage, Scene NurseMessageScene) {
		messageButton.setOnAction(e -> stage.setScene(NurseMessageScene));  
	}
	
	public void setCalendarButton(Stage stage, Scene NurseCalendarScene) {
		calendarButton.setOnAction(e -> stage.setScene(NurseCalendarScene));  
	}
	


}
