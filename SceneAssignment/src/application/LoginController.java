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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable 
{
	@FXML Button BtnSc1Login,BtnSc1Exit,BtnSc2Login,BtnSc2Exit,BtnSc3Login,BtnSc3Exit;
	@FXML TextField txtId,txtName,txtAge;
	@FXML PasswordField txtPwd;
	@FXML Label lblOutput,lblId,lblPwd;
	
	static String id;
	static String pwd;
	String name;
	String age;
	
	@Override
	
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		
	}
	
//	Screen1의 로그인버튼 클릭시
	public void BtnSc1LoginAction(ActionEvent event)
	{
		try {					
			//현재창
			Stage stage= (Stage) BtnSc1Login.getScene().getWindow(); 
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
	
//	Screen1의 나가기 버튼 클릭시
	public void BtnSc1ExitAction(ActionEvent event)
	{
		Stage stage= (Stage) BtnSc1Exit.getScene().getWindow();
		stage.close();
	}
	
//	Screen2의 로그인버튼 클릭시
	public void BtnSc2LoginAction(ActionEvent event)
	{
		try {					
			//현재창
			Stage stage= (Stage) BtnSc2Login.getScene().getWindow(); 
			Parent root = FXMLLoader.load(getClass().getResource("Screen3.fxml"));
			Scene sc2 = new Scene(root,500,500);
			sc2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc2);
			stage.setTitle("Information");
			stage.show();
			
			id = txtId.getText();
			pwd = txtPwd.getText();
			
		}catch(Exception e) {			
			e.printStackTrace();
		}
	}
	
//	Screen2의 나가기버튼 클릭시
	public void BtnSc2ExitAction(ActionEvent event)
	{
		try {					
			//현재창
			Stage stage= (Stage) BtnSc2Exit.getScene().getWindow(); 
			Parent root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
			Scene sc2 = new Scene(root,500,500);
			sc2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc2);
			stage.setTitle("Main");
			stage.show();
			
		}catch(Exception e) {			
			e.printStackTrace();
		}
	}
	
	public void BtnSc3LoginAction(ActionEvent event)
	{
		name = txtName.getText();
		age = txtAge.getText();
		
		String SecretPwd = pwd.substring(0,2);
		
		lblId.setText("Id:"+id);
		lblPwd.setText("Pwd:"+SecretPwd + "***");
		
		lblOutput.setText("Name:" + name + " Age :"+ age);
	}
	
	public void BtnSc3ExitAction(ActionEvent event)
	{
		try {					
			//현재창
			Stage stage= (Stage) BtnSc3Exit.getScene().getWindow(); 
			Parent root = FXMLLoader.load(getClass().getResource("Screen1.fxml"));
			Scene sc2 = new Scene(root,500,500);
			sc2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(sc2);
			stage.setTitle("Main");
			stage.show();
			
		}catch(Exception e) {			
			e.printStackTrace();
		}
	}
}