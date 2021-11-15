package launcher;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class launchMain extends Application {
	
	
	Scene sceneMain, scene2, scene3, scene4, scene5, DoctorPatientInfo, AddOrderViewPaneScene, DoctorMessagesViewScene, 
	doctorViewScene, AddHealthInfoViewScene, DoctorCalendarScene, DoctorPerscriptionScene, NursePatientInfoScene, NurseMessageScene, 
	NurseMyAccountScene, NurseCalendarScene, NurseAddInfoScene;

		@Override
		public void start(Stage primaryStage) {
			
			
			//Start Page
			final Text heading = new Text("Welcome to the Mentcare Health Portal");
			heading.setFont(new Font("Arial", 30));
			
			//login code
			
			
			SplitPane split = new SplitPane();
			//container for holding all signup nodes
			signUp signup = new signUp();
			
			Pane signUpPane = signup.createSignUp();
				
			//styling for the container 
			signUpPane.setPadding(new Insets(500, 0, 500, 50));
			signUpPane.setStyle("-fx-background-color: gray;");

			//end of sign up portion 

			//pane holding the signin vbox
			signIn signin = new signIn();
		
			Pane signInPane = signin.createSignIn();

				//add sign in and sign up to main split pane	
			split.getItems().addAll(signInPane, signUpPane);
			
			
			
			//create the main vbox that contain the spli't and heading panes
			VBox vboxxing = new VBox(heading, split);
			
				//styling
			vboxxing.setMargin(heading, new Insets(20, 20, 20, 60));  			
			
			//add to the scene that is 636 by 400
			Scene sceneMain = new Scene(vboxxing,636,400);
			
			//end of login gui
			
			//mssg GUI
			mssgGUI message = new mssgGUI();
			HBox messageHbox = message.createMessageGUI();
			scene5 = new Scene(messageHbox,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			//end mssg gui
			
			//appt history
			apptHist appthistory = new apptHist();
			HBox appointmentsPane = appthistory.createAppHist();
			scene4 = new Scene(appointmentsPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			//end appt history
			
			///Patient Medical Records 
			medRecords medrecords = new medRecords();
			HBox medicalRecordsPane = medrecords.createMedRecords(primaryStage, scene2, scene3, scene4, scene5);
        	scene3 = new Scene(medicalRecordsPane,640,400);      	       	
        	//end of medicalrecord gui
     	
			//patient user information screen
			userInfo userinfo = new userInfo();
			Pane pane = userinfo.createUserInfo(primaryStage, sceneMain, scene3, scene4, scene5);			
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			//end of userInfo gui
			
			
			//patient information for doctor screen
			doctorPatientInfo doctorPatientInfo = new doctorPatientInfo();
			ScrollPane doctorPatientInfoPane = doctorPatientInfo.createDoctorPatientInfo();
			DoctorPatientInfo = new Scene(doctorPatientInfoPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			//end of userInfo gui
			
			AddHealthInfoView AddHealthInfoView = new AddHealthInfoView();
			Pane AddHealthInfoViewPane = AddHealthInfoView.createAddHealthInfoView();
			AddHealthInfoViewScene = new Scene(AddHealthInfoViewPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			//doctor information View information screen
			doctorView doctorView = new doctorView();
			Pane doctorViewPane = doctorView.createDoctorInfo();
			doctorViewScene = new Scene(doctorViewPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			//end of doctorView gui
			
			DoctorPerscriptions DoctorPerscriptions = new DoctorPerscriptions();
			Pane DoctorPerscriptionsPane = DoctorPerscriptions.createDoctorPerscriptions();
			DoctorPerscriptionScene = new Scene(DoctorPerscriptionsPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			calendarDoctor calendarDoctor = new calendarDoctor();
			Pane CalendarDoctorPane = calendarDoctor.createCalendarDoctor();
			DoctorCalendarScene = new Scene(CalendarDoctorPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			DoctorMessagesView DoctorMessagesView = new DoctorMessagesView();
			ScrollPane DoctorMessagesViewPane = DoctorMessagesView.createMessageDoctorGUI();
			DoctorMessagesViewScene = new Scene(DoctorMessagesViewPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			AddOrderView AddOrderView1 = new AddOrderView();
			Pane AddOrderViewPane = AddOrderView1.createAddOrderView();
			AddOrderViewPaneScene = new Scene(AddOrderViewPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			NurseMyAccount NurseMyAccount = new NurseMyAccount();
			Pane NurseMyAccountPane = NurseMyAccount.createNurseMyAccount();
			NurseMyAccountScene = new Scene(NurseMyAccountPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			NursePatientInfo NursePatientInfo = new NursePatientInfo();
			ScrollPane NursePatientInfoPane = NursePatientInfo.createNursePatientInfo();
			NursePatientInfoScene = new Scene(NursePatientInfoPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			NurseMessage NurseMessage = new NurseMessage();
			ScrollPane NurseMessagePane = NurseMessage.createNurseMessage();
			NurseMessageScene = new Scene(NurseMessagePane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			NurseCalendar NurseCalendar = new NurseCalendar();
			HBox NurseCalendarPane = NurseCalendar.createNurseCalendar();
			NurseCalendarScene = new Scene(NurseCalendarPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();
			
			NurseAddInfo NurseAddInfo = new NurseAddInfo();
			ScrollPane NurseAddInfoPane = NurseAddInfo.createNurseAddInfo();
			NurseAddInfoScene = new Scene(NurseAddInfoPane,640,400);
			primaryStage.setScene(sceneMain);
			primaryStage.show();


			signin.setMyAccountAction(primaryStage, NurseMyAccountScene);
			
			
			message.setMyAccountAction(primaryStage, scene2);
			message.setMedRecordsAction(primaryStage, scene3);
			message.setApptAction(primaryStage, scene4);
			
			userinfo.setApptAction(primaryStage, scene4);
			userinfo.setMedRecordsAction(primaryStage, scene3);
			userinfo.setMssgAction(primaryStage, scene5);
			
			medrecords.setMyAccountAction(primaryStage, scene2);
			medrecords.setApptAction(primaryStage, scene4);
			medrecords.setMssgAction(primaryStage, scene5);
			
			appthistory.setMyAccountAction(primaryStage, scene2);
			appthistory.setMedRecordsAction(primaryStage, scene3);
			appthistory.setApptAction(primaryStage, scene4);
			appthistory.setMssgAction(primaryStage, scene5);
			
			doctorView.setpatientInfoButton(primaryStage, DoctorPatientInfo);
			doctorView.setperscriptionButton(primaryStage, DoctorPerscriptionScene);
			doctorView.setCalendarButton(primaryStage, DoctorCalendarScene);
			doctorView.setMessageButton(primaryStage, DoctorMessagesViewScene);
			
			doctorPatientInfo.setAddHealthInfoButton(primaryStage, AddHealthInfoViewScene);
			doctorPatientInfo.setMessageButton(primaryStage, DoctorMessagesViewScene);
			doctorPatientInfo.setCalendarButton(primaryStage, DoctorCalendarScene);
			doctorPatientInfo.setmyAccountButtonDoctor(primaryStage, doctorViewScene);
			doctorPatientInfo.setperscriptionButton(primaryStage, DoctorPerscriptionScene);
			
			DoctorPerscriptions.setpatientInfoButton(primaryStage, DoctorPatientInfo);
			DoctorPerscriptions.setMessageButton(primaryStage, DoctorMessagesViewScene);
			DoctorPerscriptions.setCalendarButton(primaryStage, DoctorCalendarScene);
			DoctorPerscriptions.setmyAccountButtonDoctor(primaryStage, doctorViewScene);
			DoctorPerscriptions.setorderPerscriptionButton(primaryStage, AddOrderViewPaneScene);
			
			DoctorMessagesView.setpatientInfoButton(primaryStage, DoctorPatientInfo);
			DoctorMessagesView.setperscriptionButton(primaryStage, DoctorPerscriptionScene);
			DoctorMessagesView.setCalendarButton(primaryStage, DoctorCalendarScene);
			DoctorMessagesView.setmyAccountButtonDoctor(primaryStage, doctorViewScene);
			
			calendarDoctor.setpatientInfoButton(primaryStage, DoctorPatientInfo);
			calendarDoctor.setperscriptionButton(primaryStage, DoctorPerscriptionScene);
			calendarDoctor.setMessageButton(primaryStage, DoctorMessagesViewScene);
			calendarDoctor.setmyAccountButtonDoctor(primaryStage, doctorViewScene);

			AddHealthInfoView.setbackButton(primaryStage, DoctorPatientInfo);
			AddHealthInfoView.setupdateButton(primaryStage, DoctorPatientInfo);

			
			AddOrderView1.setPlaceOrder(primaryStage, DoctorPerscriptionScene);
			AddOrderView1.setCancelOrder(primaryStage, DoctorPerscriptionScene);
			
			
			NurseMyAccount.setpatientInfoButton(primaryStage, NursePatientInfoScene);
			NurseMyAccount.setCalendarButton(primaryStage, NurseCalendarScene);
			NurseMyAccount.setaddInfo(primaryStage, NurseAddInfoScene);
			NurseMyAccount.setMessageButton(primaryStage, NurseMessageScene);
			
			NursePatientInfo.setmyAccountButtonNurse(primaryStage, NurseMyAccountScene);
			NursePatientInfo.setCalendarButton(primaryStage, NurseCalendarScene);
			NursePatientInfo.setAddInfoButton(primaryStage, NurseAddInfoScene);
			NursePatientInfo.setMessageButton(primaryStage, NurseMessageScene);

			NurseMessage.setmyAccountButtonNurse(primaryStage, NurseMyAccountScene);
			NurseMessage.setCalendarButton(primaryStage, NurseCalendarScene);
			NurseMessage.setaddInfo(primaryStage, NurseAddInfoScene);
			NurseMessage.setpatientInfoButton(primaryStage, NursePatientInfoScene);
			
			NurseCalendar.setmyAccountButtonNurse(primaryStage, NurseMyAccountScene);
			NurseCalendar.setMessageButton(primaryStage, NurseMessageScene);
			NurseCalendar.setaddInfo(primaryStage, NurseAddInfoScene);
			NurseCalendar.setpatientInfoButton(primaryStage, NursePatientInfoScene);
			
			NurseAddInfo.setmyAccountButtonNurse(primaryStage, NurseMyAccountScene);
			NurseAddInfo.setMessageButton(primaryStage, NurseMessageScene);
			NurseAddInfo.setCalendarButton(primaryStage, NurseCalendarScene);
			NurseAddInfo.setpatientInfoButton(primaryStage, NursePatientInfoScene);
	    }
		
		
		
		public static void main(String[] args) {
			launch(args);
		}
		
}
