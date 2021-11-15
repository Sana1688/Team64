package launcher;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


//sign up scene

public class signUp {
	public Pane createSignUp()
	{
		
		//everything for the sign up half of the screen
		Label needAnAccount = new Label("Need an account?");
		needAnAccount.setFont(new Font("Arial", 15));

		
		GridPane gridPane = new GridPane(); //to store labels and corresponding text fields together

		Label signUpFirstLabel = new Label("First Name:");
		TextField signUpFirstField = new TextField(); //new first name textfield

		Label signUpLastLabel = new Label("Last Name:");
		TextField signUpLast = new TextField(); //new last name textfield
		
		Label dateOfBirthLabel = new Label("Date of Birth");
		DatePicker dateOfBirth = new DatePicker(); //new DOB date picker
		
			
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
        Button signUpButton = new Button("Sign Up"); //sign up button
        
		//container for hold all the sign-up items
		VBox vContainerSignUp = new VBox(needAnAccount, gridPane, signUpButton);
		
		//adding margins to create the visuals we want for the app
		vContainerSignUp.setMargin(needAnAccount, new Insets(20, 20, 0, 120));  			
		vContainerSignUp.setMargin(gridPane, new Insets(10, 20, 5, 5));  			
		vContainerSignUp.setMargin(signUpButton, new Insets(20, 20, 10, 220));  			

		Pane signUpPane = new Pane(vContainerSignUp);
		
		return signUpPane;
		
	}
}
