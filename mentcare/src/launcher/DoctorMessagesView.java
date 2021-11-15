package launcher;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


//Doctor Messages view

public class DoctorMessagesView {
	 private Button myAccountButtonDoctor;
	 private Button patientInfoButton;
	 private Button calendarButton;
	 private Button perscriptionButton;
	 private Button messageButton;
	 
	 
	public ScrollPane createMessageDoctorGUI()
	{//navigation buttons
		myAccountButtonDoctor = new Button("My Account");
        myAccountButtonDoctor.setMinSize(180, 50);
    	
	    patientInfoButton = new Button("Patient Info");
	    patientInfoButton.setMinSize(180, 50);	        	
	    
	    calendarButton = new Button("Calendar");
	    calendarButton.setMinSize(180, 50);
	
	    perscriptionButton = new Button("Perscription");
	    perscriptionButton.setMinSize(180, 50);
	    
	    messageButton = new Button("Message");
	    messageButton.setMinSize(180, 50);
	    //
	    
	    ScrollPane scrollPane = new ScrollPane();
	    
		VBox buttonContainer = new VBox(myAccountButtonDoctor, patientInfoButton,calendarButton, perscriptionButton, messageButton);

        Label messageLabel = new Label("Message");
        messageLabel.setFont(new Font("Arial", 30));
        
        
        Label toLabel= new Label("To: ");
        TextField toTextField = new TextField("");// field for message to
        
        Label subjectLabel= new Label("Subject: ");
        TextField subjectTextField = new TextField(""); //subject field
        
        GridPane toAndSubjectGrid = new GridPane();
        
        		
        toAndSubjectGrid.add(toLabel, 0, 0, 1, 1);
        toAndSubjectGrid.add(toTextField, 1, 0, 1, 1);
        toAndSubjectGrid.add(subjectLabel, 0, 1, 1, 1);
        toAndSubjectGrid.add(subjectTextField, 1, 1, 1, 1);
     
	
    	//spacing out the nodes
        toAndSubjectGrid.setVgap(10);
        toAndSubjectGrid.setHgap(20);
        
        TextArea messageContent = new TextArea("");
        double contentWidth = 300;
        double contentHeight = 100;
        
        messageContent.setPrefWidth(contentWidth);
        messageContent.setPrefHeight(contentHeight);

        
        Button sendButton = new Button("Send"); //send button (add to database)
        
        

        TableView messageTable = new TableView(); //table to display message history
        
        TableColumn senderColumn = new TableColumn("Sender Name");
        TableColumn messageCol = new TableColumn("Message");
   


        messageTable.setFixedCellSize(25);
        messageTable.prefHeightProperty().bind(messageTable.fixedCellSizeProperty().multiply(Bindings.size(messageTable.getItems()).add(1.01)));
        messageTable.minHeightProperty().bind(messageTable.prefHeightProperty());
        messageTable.maxHeightProperty().bind(messageTable.prefHeightProperty());
        
        messageTable.getColumns().addAll(senderColumn, messageCol);

        VBox messageContainer = new VBox(messageLabel, toAndSubjectGrid, messageContent, sendButton, messageTable);
        
        
        messageContainer.setMargin(messageLabel, new Insets(20, 0, 0, 10));
        messageContainer.setMargin(toAndSubjectGrid, new Insets(20, 0, 0, 50));
        messageContainer.setMargin(messageContent, new Insets(20, 0, 0, 50));
        messageContainer.setMargin(sendButton, new Insets(20, 0, 0, 350));
        messageContainer.setMargin(messageTable, new Insets(20, 0, 0, 20));


    	HBox messageHbox = new HBox(buttonContainer, messageContainer);
    	
    	scrollPane.setContent(messageHbox);
    	scrollPane.pannableProperty().set(true);
    	return scrollPane;
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
	
	public void setperscriptionButton(Stage stage, Scene DoctorPerscriptionScene) {
		perscriptionButton.setOnAction(e -> stage.setScene(DoctorPerscriptionScene));  
	}
	
}
