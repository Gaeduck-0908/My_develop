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
import javafx.stage.Stage;

public class Screen1Controller implements Initializable 
{
	@FXML Button btn2open,btn1close;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
	}
	
	public void btn2openAction(ActionEvent event)
	{
		try {					
			//ÇöÀçÃ¢
			Stage stage= (Stage) btn2open.getScene().getWindow(); 
			Parent root = FXMLLoader.load(getClass().getResource("Screen2.fxml"));
			Scene sc2 = new Scene(root,500,500);
			sc2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc2);
			stage.setTitle("Login");
			stage.show();
			
		}catch(Exception e) {			
			e.printStackTrace();
		}
	}

	public void btn1closeAction(ActionEvent event)
	{
		Stage stage= (Stage) btn2open.getScene().getWindow();
		stage.close();
	}
}
