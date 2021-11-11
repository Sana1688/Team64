package launcher;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class launchMain extends Application {
		@Override
		public void start(Stage primaryStage) {
			//define colors used in this page;
			
			Text heading = new Text("Welcome to the Mentcare Health Portal");
				 heading.setFont(new Font("Arial", 30));
				

			
			SplitPane split = new SplitPane();
				//everything for the sign up half of the screen
					Label needAnAccount = new Label("Need an account?");
					needAnAccount.setFont(new Font("Arial", 15));

					
					GridPane gridPane = new GridPane(); //to store labels and corresponding text fields together

					Label signUpFirstLabel = new Label("First Name:");
					TextField signUpFirstField = new TextField();

					Label signUpLastLabel = new Label("Last Name:");
					TextField signUpLast = new TextField();
					
					Label dateOfBirthLabel = new Label("Date of Birth");
					DatePicker dateOfBirth = new DatePicker();
					
					
					
						//putting labels and corresponding fields into grid
						gridPane.add(signUpFirstLabel, 0, 0, 1, 1);
				        gridPane.add(signUpFirstField, 1, 0, 1, 1);
				        gridPane.add(signUpLastLabel, 0, 1, 1, 1);
				        gridPane.add(signUpLast, 1, 1, 1, 1);
				        gridPane.add(dateOfBirthLabel, 0, 2, 1, 1);
				        gridPane.add(dateOfBirth, 1, 2, 1, 1);
					
			        	//spacing out the nodes
				        gridPane.setVgap(20);
					    gridPane.setHgap(20);

			        
					//sign up button
			        Button signUpButton = new Button("Sign Up");
			        
					//container for hold all the sign-up items
					VBox vContainerSignUp = new VBox(needAnAccount, gridPane, signUpButton);
					
						//adding margins to create the visuals we want for the app
						vContainerSignUp.setMargin(needAnAccount, new Insets(20, 20, 0, 120));  			
						vContainerSignUp.setMargin(gridPane, new Insets(10, 20, 5, 5));  			
						vContainerSignUp.setMargin(signUpButton, new Insets(20, 20, 10, 220));  			

					
					
					//container for holding all signup nodes
					Pane signUpPane = new Pane(vContainerSignUp);
						
						//styling for the container 
						signUpPane.setPadding(new Insets(500, 0, 500, 50));
						signUpPane.setStyle("-fx-background-color: gray;");

				//end of sign up portion 
						
						
				
				//start of sign in half of the screen
						
					//top text	
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
			        
			        //hbox to contain the radio buttons in a single row
			        HBox hboxForRadio = new HBox(patientRadio, doctorRadio, nurseRadio);
			        	
			        	//space out the buttons
			        	hboxForRadio.setSpacing(20);
					
			        //button to login user
			        Button loginButton = new Button("Login");
			        
			        //grid for radios
			        GridPane bottomGrid = new GridPane();
			        	
			        	//add radios and set horizontal spacing 
				        bottomGrid.add(hboxForRadio, 1, 1, 1, 1);
				        bottomGrid.setHgap(50);
			        
			        //container holding all Sign In items
			        VBox signInVBox = new VBox(signIn, signInGridPane,identifierLabel,bottomGrid,loginButton);
				       
			        	//spacing each item to style them correctly
			        	signInVBox.setMargin(signIn, new Insets(20, 20, 0, 150));  			
				        signInVBox.setMargin(signInGridPane, new Insets(10, 20, 20, 5));  
				        signInVBox.setMargin(identifierLabel, new Insets(5, 5, 10, 5));  			
				        signInVBox.setMargin(loginButton, new Insets(30, 5, 5, 230));  			


			        //pane holding the signin vbox
					Pane signInPane = new Pane(signInVBox);

				//add sign in and sign up to main split pane	
			split.getItems().addAll(signInPane, signUpPane);
				
				
			
				
			//create the main vbox that contain the split and heading panes
			VBox vbox = new VBox(heading, split);
			
				//styling
				vbox.setMargin(heading, new Insets(20, 20, 20, 60));  			
			
			//add to the scene that is 636 by 400
			Scene scene = new Scene(vbox,636,400);
			primaryStage.setScene(scene);
			primaryStage.show();
	    }
		
		
		
		public static void main(String[] args) {
			launch(args);
		}
		
}