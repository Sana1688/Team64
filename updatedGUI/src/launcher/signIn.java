package launcher;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class signIn {
	private Button loginButton;
	public Scene chosenScene;
	private Scene scene2;
	public Pane createSignIn()
	{
		//top text	
		
		Label error = new Label("Could not find user. Try again or create an account");
		error.setTextFill(Color.RED);
		

		
		Label signIn = new Label("Sign In");
			signIn.setFont(new Font("Arial", 15));

		//all the labels and textfield needed for login
		Label signInFirstLabel = new Label("First Name:");
		TextField signInFirstField = new TextField();
		

		Label signInLastLabel = new Label("Last Name:");
		TextField signInLastField = new TextField();
	
		Label dateOfBirthLabelSignIn = new Label("Date of Birth");
		DatePicker dateOfBirthSignIn = new DatePicker();
		
		//grid to hold the labels and text together
		GridPane signInGridPane = new GridPane();
		
		//adding lsbels and textfield to grid
		signInGridPane.add(signInFirstLabel, 0, 0, 1, 1);
		signInGridPane.add(signInFirstField, 1, 0, 1, 1);
		signInGridPane.add(signInLastLabel, 0, 1, 1, 1);
		signInGridPane.add(signInLastField, 1, 1, 1, 1);
		signInGridPane.add(dateOfBirthLabelSignIn, 0, 2, 1, 1);
		signInGridPane.add(dateOfBirthSignIn, 1, 2, 1, 1);
		
		//spacing out nodes
	    signInGridPane.setHgap(20);
	    signInGridPane.setVgap(20);

	    
		 //instructions for user to pick their relationship
        Label identifierLabel = new Label("Are You a:");
        
        //radio button for each of the categories of relationship
        RadioButton patientRadio = new RadioButton("Patient");
        RadioButton doctorRadio = new RadioButton("Doctor");
        RadioButton nurseRadio = new RadioButton("Nurse");
        
        ToggleGroup group = new ToggleGroup();
        
        patientRadio.setToggleGroup(group);
        doctorRadio.setToggleGroup(group);
        nurseRadio.setToggleGroup(group);
        
        

        
        //hbox to contain the radio buttons in a single row
        HBox hboxForRadio = new HBox(patientRadio, doctorRadio, nurseRadio);
        	
        	//space out the buttons
        	hboxForRadio.setSpacing(20);
		
        //button to login user
        loginButton = new Button("Login");
        
        //grid for radios
        GridPane bottomGrid = new GridPane();
        	
        	//add radios and set horizontal spacing 
	        bottomGrid.add(hboxForRadio, 1, 1, 1, 1);
	        bottomGrid.setHgap(50);
        
        //container holding all Sign In items
        VBox signInVBox = new VBox(error, signIn, signInGridPane,identifierLabel,bottomGrid,loginButton);
        
        error.setVisible(true);
        
        //signInVBox.setOnAction(e -> primaryStage.setScene(scene2));   

	       
		//spacing each item to style them correctly
		signInVBox.setMargin(error, new Insets(20, 20, 0, 20));  			
		signInVBox.setMargin(signIn, new Insets(20, 20, 0, 150));  			
		signInVBox.setMargin(signInGridPane, new Insets(10, 20, 20, 5));  
		signInVBox.setMargin(identifierLabel, new Insets(5, 5, 10, 5));  			
		signInVBox.setMargin(loginButton, new Insets(20, 5, 5, 230));  	
		
		Pane signInPane = new Pane(signInVBox);
		
		return signInPane;
		
		
		
	}
	
	
	public void setMyAccountAction(Stage stage, Scene scene2) 
	{
		loginButton.setOnAction(e -> stage.setScene(scene2));   
	}
	
}
