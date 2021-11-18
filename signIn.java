package launcher;

import javafx.beans.value.ChangeListener;
import java.awt.event.*;
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
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;


//sign in scene
public class signIn {
	private Button loginButton;
	public Scene chosenScene;
	private ToggleGroup group;
	private RadioButton patientRadio;
	private RadioButton nurseRadio;
	private RadioButton doctorRadio;
	private RadioButton selectedRadioButton;
	private String groupValue;
	static JTextField userNameField;
	static JTextField passwordField;

	
	public Pane createSignIn(Stage primaryStage, Scene NurseMyAccountScene, Scene sceneMain, Scene doctorViewScene, Scene scene2)
	{
		//top text	
		firstnameField = new JTextField(10);
	    lastnameField = new JTextField(10);
	    DOBField = new JTextField(10);
		
		ActionListener loginListener = new ClickListener();
		loginButton.addActionListener(loginListener);
		
		Label error = new Label("Could not find user. Try again or create an account");
		error.setTextFill(Color.RED);
		

		
		Label signIn = new Label("Sign In");
			signIn.setFont(new Font("Arial", 15));

		//all the labels and textfield needed for login
		Label signInFirstLabel = new Label("First Name:");
		TextField signInFirstField = new TextField(); //first name textfield
		

		Label signInLastLabel = new Label("Last Name:");
		TextField signInLastField = new TextField(); //last name text field
	
		Label dateOfBirthLabelSignIn = new Label("Date of Birth");
		DatePicker dateOfBirthSignIn = new DatePicker(); //birthdate picker
		
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
        patientRadio = new RadioButton("Patient");
        doctorRadio = new RadioButton("Doctor");
        nurseRadio = new RadioButton("Nurse");
        
        group = new ToggleGroup();
        
        patientRadio.setToggleGroup(group);
        doctorRadio.setToggleGroup(group);
        nurseRadio.setToggleGroup(group);
        
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){ //listner for which radio button (whether patient, nurse, doctor) is picked. send to appropiate scen
            public void changed(ObservableValue<? extends Toggle> ov,
                    Toggle old_toggle, Toggle new_toggle) {
            			selectedRadioButton = (RadioButton) group.getSelectedToggle();
                        if (group.getSelectedToggle() != null) {
                        	groupValue = selectedRadioButton.getText();
                			if ( groupValue == "Nurse") {
                				loginButton.setOnAction(e -> primaryStage.setScene(NurseMyAccountScene)); 
                			} else if ( groupValue == "Doctor") {
                				loginButton.setOnAction(e -> primaryStage.setScene(doctorViewScene)); 
                			} else if  (groupValue == "Patient"){
                				loginButton.setOnAction(e -> primaryStage.setScene(scene2)); 
                			} 
                        }                
                    }
            });
        
       
        
        //hbox to contain the radio buttons in a single row
        HBox hboxForRadio = new HBox(patientRadio, doctorRadio, nurseRadio);
        	
        	//space out the buttons
        	hboxForRadio.setSpacing(20);
		
        //button to login user
        loginButton = new Button("Login"); //login button
        
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

	
	public void setLoginAction(Stage primaryStage, Scene NurseMyAccountScene, Scene scene2, Scene doctorViewScene, Scene sceneMain) 
	{
		 group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
	            public void changed(ObservableValue<? extends Toggle> ov,
	                    Toggle old_toggle, Toggle new_toggle) {
	            			selectedRadioButton = (RadioButton) group.getSelectedToggle();
	                        if (group.getSelectedToggle() != null) {
	                        	groupValue = selectedRadioButton.getText();
	                			if ( groupValue == "Nurse") {
	                				loginButton.setOnAction(e -> primaryStage.setScene(NurseMyAccountScene)); 
	                			} else if ( groupValue == "Doctor") {
	                				loginButton.setOnAction(e -> primaryStage.setScene(doctorViewScene)); 
	                			} else if  (groupValue == "Patient"){
	                				loginButton.setOnAction(e -> primaryStage.setScene(scene2)); 
	                			} 
	                			
	                			System.out.print(group.getSelectedToggle());
	                        }                
	                    }
	            });
	}
	
	 public class ClickListener implements ActionListener 
	 {
	
	public void actionPerformed(ActionEvent event)
	   {
	     File inputFile = new File("USERDATA.txt");
	     
	     
	     String firstnameInput = nameField.getText();
	     String lastnameInput = nameField.getText();
	     String DOBInput = DOBField.getText();
	     
	     try {
	            Scanner in = new Scanner(new File("USERDATA.txt"));
	            while (in.hasNextLine())
	            {
	              String s = in.nextLine();  
	              String[] sArray = s.split(" ");
	              
	              System.out.println(sArray[0]);
	              System.out.println(sArray[1]);
	              System.out.println(sArray[2]);
	              
	              if (firstnameInput == sArray[0] && lastnameInput == sArray[1] && DOBInput == sArray[2])
	              {
	            	  System.out.print("Log in sucessful");
	              }
	              else
	              {
	            	  System.out.print("Log in failed");
	              }
	            }
	            
	            in.close();
	            
	        } catch (FileNotFoundException e) {
	            System.out.print("EROOR");
	        }
	    
	   }
	 }

}
