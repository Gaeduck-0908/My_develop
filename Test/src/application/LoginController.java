package application;

import java.net.URL;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController implements Initializable 
{
	@FXML Label lblGender,lblYear,lblOutput;
	@FXML TextField txtYear;
	@FXML Button btnCheck,btnCancel;
	@FXML ChoiceBox<String> boxGender;
	
//	������ ���� ��Ű���� �޽��� �ڽ� ����� ���� ��Ű��
	Random Rd = new Random();
	JOptionPane Pane = new JOptionPane();
	
//	üũ�ڽ��� ����Ʈ ����
	String [] Gender = {"����","����"};
	
//	������ �⵵���� ������ ������ ���������� ��ȣ�� ���� ������ ����Ʈ
	int firstNum = 0;
	String lastNum = "";
	int [] NumList = new int[6];
	
//	üũ�ڽ� ����
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		boxGender.getItems().addAll(Gender);
		boxGender.setStyle("-fx-font: 30px \"����\";");
	}
	
//	������ưŬ����
	public void btnCreateAction(ActionEvent event)
	{
//		try���� ���� ����ó���� ����.
		try
		{
//			tmpYear���� �⵵�� �����
			int tmpYear = Integer.parseInt(txtYear.getText());
//			length ���� �⵵���� ���̸� ����
			int length = (int)(Math.log10(tmpYear)+1);
			System.out.println(length);
			
//			4�ڸ��� �⵵ �����϶��� ����.
			if(length < 5)
			{
//				üũ�ڽ��� üũ������ �����ϰ��
				if(boxGender.getValue().toString() == "����")
				{
//					2000 ���ϸ� 1
					if(tmpYear <2000)
					{
						firstNum = 1;
						System.out.println(firstNum);
					}
//					�׿� 3
					else
					{
						firstNum = 3;
						System.out.println(firstNum);
					}
				}
//				üũ�ڽ��� üũ������ �����ϰ��
				else if(boxGender.getValue().toString() == "����")
				{
//					2000�⵵ 2
					if(tmpYear <2000)
					{
						firstNum = 2;
						System.out.println(firstNum);
					}
//					�׿� 4
					else
					{
						firstNum = 4;
						System.out.println(firstNum);
					}
				}
//				�ݺ����� ���� �������� ������
				for (int i = 0; i<6; i++)
				{
					NumList[i] = Rd.nextInt(9)+1;
					System.out.print(NumList[i]);
					lastNum = Arrays.toString(NumList).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
				}
//				���
				lblOutput.setText("����� �ֹι�ȣ ���ڸ���:"+String.valueOf(firstNum)+lastNum + " �Դϴ�.");
			}
//			5�ڸ��̻��Ͻ� ���
			else
			{
//				����������� ���׷����� �ּ�ó��
//				JOptionPane.showMessageDialog(null, "4�ڸ� ������ ���� �Է����ּ���.","��������", JOptionPane.ERROR_MESSAGE);
				System.out.println("4�ڸ��� ���� �Է����ּ���.");
			}
		}
		catch(Exception e)
		{
//			������� ���׷����� �ּ�ó��
//			JOptionPane.showMessageDialog(null, "�߸��� �Է°��Դϴ�.","ERROR", JOptionPane.ERROR_MESSAGE);
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
	}
	
//	��ҹ�ư ������
	public void btnCancelAction(ActionEvent event)
	{
		txtYear.setText("");
		lblOutput.setText("");
	}
}