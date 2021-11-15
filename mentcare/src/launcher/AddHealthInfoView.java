package launcher;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
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

//Add health information scene for doctor (appears when adding info in the doctorPatient scene)

public class AddHealthInfoView {
	
	Button backButton;
	Button updateButton;
	
	public Pane createAddHealthInfoView()
	{

		
		
		Label updateMedicalInformationLabel = new Label("Update Medical Information");
		updateMedicalInformationLabel.setFont(new Font("Arial", 30));
		
		Label testResultLabel = new Label("Test Results:");
		TextField testResult = new TextField(); //test result field

		
		Label concernsLabel = new Label("Concerns:");
		TextField concernsField = new TextField(); //concerns field

		Label extrasLabel = new Label("Extras:");
		TextField extrasField = new TextField(); //extras field
		
		backButton = new Button("Back");//back button
		updateButton = new Button("Update");//update button when clicked, update information
		
		HBox updateButtonsContainer = new HBox(backButton, updateButton);
		updateButtonsContainer.setMargin(updateButton, new Insets(0, 0, 0, 20));


		GridPane updateInfoGrid = new GridPane();
		
		updateInfoGrid.add(testResultLabel, 0, 0, 1, 1);
		updateInfoGrid.add(testResult, 1, 0, 1, 1);
		
		updateInfoGrid.add(concernsLabel, 0, 1, 1, 1);
		updateInfoGrid.add(concernsField, 1, 1, 1, 1);
		
		updateInfoGrid.add(extrasLabel, 0, 2, 1, 1);
		updateInfoGrid.add(extrasField, 1, 2, 1, 1);
		
		updateInfoGrid.setVgap(20);
		updateInfoGrid.setHgap(20);
		
		VBox updateInfoContainer = new VBox(updateMedicalInformationLabel, updateInfoGrid, updateButtonsContainer);
		
		updateInfoContainer.setMargin(updateMedicalInformationLabel, new Insets(20, 0, 20, 150));
		updateInfoContainer.setMargin(updateInfoGrid, new Insets(20, 0, 0, 180));
		updateInfoContainer.setMargin(updateButtonsContainer, new Insets(20, 0, 0, 220));


		
		Pane updateInfoPane = new Pane(updateInfoContainer);
		return updateInfoPane;
		
		
	}
	
		public void setbackButton(Stage stage, Scene DoctorPatientInfo) 
		{
			backButton.setOnAction(e -> stage.setScene(DoctorPatientInfo));   
		}
		
		public void setupdateButton(Stage stage, Scene DoctorPatientInfo) 
		{
			updateButton.setOnAction(e -> stage.setScene(DoctorPatientInfo));   
		}

		
		
	}
