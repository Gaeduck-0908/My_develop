package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	@FXML TextField txtId;
	@FXML PasswordField txtPwd;
	@FXML Button btnLogin,btnReg,btnCancel,btnClose,btnTabelview;
	@FXML Label lblLogininfo;
	
	public static DBtest db;
	public static Connection conn;
	public static boolean loginresult;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		conn = db.dbconnect();
	}
	
	public void btnLoginAction(ActionEvent event)
	{
		String sql = "SELECT userId, userpwd"
				+ " FROM SMEMBER"
				+ " WHERE userId=?"
				+ " AND userpwd=?";
		
		try
		{
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, txtId.getText());
			ps.setString(2, txtPwd.getText());
			ps.executeUpdate(); 
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				lblLogininfo.setText("�α�������: ���� (Users)");
				System.out.println("�α��μ���");
			}
			else
			{
				lblLogininfo.setText("�α�������: ����");
				System.out.println("�α��ν���");
			}
			
			ps.close();
			rs.close();
		}
		catch(Exception e)
		{
			
		}
	}
	public void btnRegAction(ActionEvent event)
	{
		try {					
		    Parent root = FXMLLoader.load(getClass().getResource("Reg.fxml"));
		    Stage stage = new Stage();
		    stage.setTitle("ȸ������");
		    stage.setScene(new Scene(root));
		    stage.show();

			
		}catch(Exception e) {			
			e.printStackTrace();
		}
	}
	public void btnCancelAction(ActionEvent event)
	{
		txtId.setText("");
		txtPwd.setText("");
		lblLogininfo.setText("�α�������:");
	}
	public void btnCloseAction(ActionEvent event)
	{
		Stage stage= (Stage) btnClose.getScene().getWindow();
		stage.close();
	}
	public void btnTableviewAction(ActionEvent event)
	{
		try {					
		    Parent root = FXMLLoader.load(getClass().getResource("view.fxml"));
		    Stage stage = new Stage();
		    stage.setTitle("TableView");
		    stage.setScene(new Scene(root));
		    stage.show();

			
		}catch(Exception e) {			
			e.printStackTrace();
		}
	}
	public boolean Adminlogin()
	{
		boolean result = false;
		
		return result;
	}
	public boolean userlogin()
	{
		boolean result = false;
		
		return result;
	}
}
