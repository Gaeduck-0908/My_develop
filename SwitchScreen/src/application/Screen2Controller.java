package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Screen2Controller implements Initializable 
{
	@FXML Button btn3open,btn2close;
	@FXML TextField txtInputId;
	@FXML PasswordField txtinputPwd;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		
	}
	
	public void btn3openAction(ActionEvent event)
	{
		try {					
			//ÇöÀçÃ¢
			Stage stage= (Stage) btn3open.getScene().getWindow(); 
			Parent root = FXMLLoader.load(getClass().getResource("Screen3.fxml"));
			Scene sc1 = new Scene(root,500,500);
			sc1.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc1);
			stage.setTitle("Information");
			stage.show();
			
		}catch(Exception e) {			
			e.printStackTrace();
		}
	}

	public void btn2closeAction(ActionEvent event)
	{
		Stage stage= (Stage) btn3open.getScene().getWindow();
		stage.close();
	}
}