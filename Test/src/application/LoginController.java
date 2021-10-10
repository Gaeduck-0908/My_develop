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
	
//	난수를 위한 패키지와 메시지 박스 출력을 휘한 패키지
	Random Rd = new Random();
	JOptionPane Pane = new JOptionPane();
	
//	체크박스의 리스트 내용
	String [] Gender = {"남자","여자"};
	
//	성별과 년도생을 가르는 변수와 랜덤생성될 번호를 담을 변수와 리스트
	int firstNum = 0;
	String lastNum = "";
	int [] NumList = new int[6];
	
//	체크박스 설정
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		boxGender.getItems().addAll(Gender);
		boxGender.setStyle("-fx-font: 30px \"돋움\";");
	}
	
//	생성버튼클릭시
	public void btnCreateAction(ActionEvent event)
	{
//		try문을 통해 예외처리를 해줌.
		try
		{
//			tmpYear에는 년도를 담아줌
			int tmpYear = Integer.parseInt(txtYear.getText());
//			length 에는 년도수의 길이를 재줌
			int length = (int)(Math.log10(tmpYear)+1);
			System.out.println(length);
			
//			4자리의 년도 이하일때만 실행.
			if(length < 5)
			{
//				체크박스의 체크내용이 남자일경우
				if(boxGender.getValue().toString() == "남자")
				{
//					2000 이하면 1
					if(tmpYear <2000)
					{
						firstNum = 1;
						System.out.println(firstNum);
					}
//					그외 3
					else
					{
						firstNum = 3;
						System.out.println(firstNum);
					}
				}
//				체크박스의 체크내용이 여자일경우
				else if(boxGender.getValue().toString() == "여자")
				{
//					2000년도 2
					if(tmpYear <2000)
					{
						firstNum = 2;
						System.out.println(firstNum);
					}
//					그외 4
					else
					{
						firstNum = 4;
						System.out.println(firstNum);
					}
				}
//				반복문을 통해 랜덤으로 수생성
				for (int i = 0; i<6; i++)
				{
					NumList[i] = Rd.nextInt(9)+1;
					System.out.print(NumList[i]);
					lastNum = Arrays.toString(NumList).replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
				}
//				출력
				lblOutput.setText("당신의 주민번호 뒷자리는:"+String.valueOf(firstNum)+lastNum + " 입니다.");
			}
//			5자리이상일시 출력
			else
			{
//				응답없음으로 버그로인한 주석처리
//				JOptionPane.showMessageDialog(null, "4자리 이하의 수를 입력해주세요.","범위오류", JOptionPane.ERROR_MESSAGE);
				System.out.println("4자리의 수를 입력해주세요.");
			}
		}
		catch(Exception e)
		{
//			응답없음 버그로인한 주석처리
//			JOptionPane.showMessageDialog(null, "잘못된 입력값입니다.","ERROR", JOptionPane.ERROR_MESSAGE);
			System.out.println("잘못된 입력값입니다.");
		}
	}
	
//	취소버튼 누를시
	public void btnCancelAction(ActionEvent event)
	{
		txtYear.setText("");
		lblOutput.setText("");
	}
}