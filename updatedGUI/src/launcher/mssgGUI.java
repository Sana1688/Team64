package launcher;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class mssgGUI {
	private Button myAccountButtonPatientMsg;
	private Button medicalRecordsPatientMsg;
	private Button appointmentsButtonPatientMsg;
	private Button messageButtonPatientMsg;

	public HBox createMessageGUI()
	{
		myAccountButtonPatientMsg = new Button("My Account");
    	myAccountButtonPatientMsg.setMinSize(180, 50);
    	
    	medicalRecordsPatientMsg = new Button("Medical Records");  
    	medicalRecordsPatientMsg.setMinSize(180, 50);
    
    	appointmentsButtonPatientMsg = new Button("Appointments");
    	appointmentsButtonPatientMsg.setMinSize(180, 50);

    	
    	messageButtonPatientMsg = new Button("Message");
    	messageButtonPatientMsg.setMinSize(180, 50);

	    VBox buttonContainerMsg = new VBox(myAccountButtonPatientMsg, medicalRecordsPatientMsg,appointmentsButtonPatientMsg, messageButtonPatientMsg);
    	
        Label messageLabel = new Label("Message");
        messageLabel.setFont(new Font("Arial", 30));
        
        
        Label toLabel= new Label("To: ");
        TextField toTextField = new TextField("");
        
        Label subjectLabel= new Label("Subject: ");
        TextField subjectTextField = new TextField("");
        
        GridPane toAndSubjectGrid = new GridPane();
        
        		
        toAndSubjectGrid.add(toLabel, 0, 0, 1, 1);
        toAndSubjectGrid.add(toTextField, 1, 0, 1, 1);
        toAndSubjectGrid.add(subjectLabel, 0, 1, 1, 1);
        toAndSubjectGrid.add(subjectTextField, 1, 1, 1, 1);
     
	
    	//spacing out the nodes
        toAndSubjectGrid.setVgap(20);
        toAndSubjectGrid.setHgap(20);
        
        TextArea messageContent = new TextArea("");
        double contentWidth = 300;
        
        messageContent.setPrefWidth(contentWidth);
        
        Button sendButton = new Button("Send");

        VBox messageContainer = new VBox(messageLabel, toAndSubjectGrid, messageContent, sendButton);
        
        messageContainer.setMargin(messageLabel, new Insets(20, 0, 0, 10));
        messageContainer.setMargin(toAndSubjectGrid, new Insets(20, 0, 0, 50));
        messageContainer.setMargin(messageContent, new Insets(20, 0, 0, 50));
        messageContainer.setMargin(sendButton, new Insets(20, 0, 0, 350));

    	HBox messageHbox = new HBox(buttonContainerMsg, messageContainer);
    	return messageHbox;
	}
	
	public void setMyAccountAction(Stage stage, Scene scene2) 
	{
		myAccountButtonPatientMsg.setOnAction(e -> stage.setScene(scene2));   
	}
	
	public void setMedRecordsAction(Stage stage, Scene scene3) 
	{
		medicalRecordsPatientMsg.setOnAction(e -> stage.setScene(scene3));   
	}
	
	public void setApptAction(Stage stage, Scene scene4) 
	{
		appointmentsButtonPatientMsg.setOnAction(e -> stage.setScene(scene4));   
	}
	
}
