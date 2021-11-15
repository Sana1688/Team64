package launcher;

import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.PasswordField;
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

//Create order scene for doctor(appears when ordering new prescription)

public class AddOrderView {
	 private Button cancelOrder;
	 private Button placeOrder;
	 
	
	public Pane createAddOrderView()
	{

		
		 Label orderLabel = new Label("Order Prescription");
	        orderLabel.setFont(new Font("Arial", 25));
	        
	        Label perscriptionOrderName = new Label("Prescription");
	        TextField perscriptionOrderNameField = new TextField(); //Prescription text field
	        
	        Label quantityLabel = new Label("Quantity");
	        MenuButton orderQuantity = new MenuButton(); //menu button to pick quatity of medication to order
	        orderQuantity.getItems().addAll(new MenuItem("1"), new MenuItem("2"), new MenuItem("3"), new MenuItem("4"), new MenuItem("5"));
	        
	        Label locationLabel = new Label("Location:");
	        TextField locationName = new TextField();//location text field
	        
	        Label nameLabel = new Label("Name:");
	        TextField name = new TextField();//name text field

	        Label passKeyLabel = new Label("Passkey:");
	        PasswordField passField = new PasswordField();//password field
	        
	        GridPane orderGrid = new GridPane();
	        
	        orderGrid.add(perscriptionOrderName, 0, 0, 1, 1);
	        orderGrid.add(perscriptionOrderNameField, 1, 0, 1, 1);

	        orderGrid.add(quantityLabel, 0, 2, 1, 1);
	        orderGrid.add(orderQuantity, 1, 2, 1, 1);

	        
	        orderGrid.add(locationLabel, 0, 3, 1, 1);
	        orderGrid.add(locationName, 1, 3, 1, 1);
			
	        orderGrid.add(nameLabel, 0, 4, 1, 1);
	        orderGrid.add(name, 1, 4, 1, 1);
			
	        orderGrid.add(passKeyLabel, 0, 5, 1, 1);
	        orderGrid.add(passField, 1, 5, 1, 1);
	        
	        orderGrid.setVgap(20);
	        orderGrid.setHgap(20);
	        
	        placeOrder = new Button("Order"); //order button
	        cancelOrder = new Button("Back"); // back button (when either button is clicked, it returns to the prescription scene
	        
	        
	        HBox orderButtonsHBox = new HBox(cancelOrder, placeOrder);
	        orderButtonsHBox.setMargin(placeOrder, new Insets(0, 0, 0, 20));

	        
	        VBox orderVBox = new VBox(orderLabel, orderGrid, orderButtonsHBox);
	        
	        orderVBox.setMargin(orderLabel, new Insets(20, 0, 0, 150));
	        orderVBox.setMargin(orderGrid, new Insets(20, 0, 0, 150));
	        orderVBox.setMargin(orderButtonsHBox, new Insets(20, 0, 0, 200));

		
		
		return orderVBox;
		
		
	}

	public void setPlaceOrder(Stage stage, Scene DoctorPerscriptionScene) 
	{
		placeOrder.setOnAction(e -> stage.setScene(DoctorPerscriptionScene));  

	}

	public void setCancelOrder(Stage stage, Scene DoctorPerscriptionScene) 
	{
		cancelOrder.setOnAction(e -> stage.setScene(DoctorPerscriptionScene));   

	}


}
