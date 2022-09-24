package application;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class kioskController implements Initializable 
{
	@FXML Button btnM1p,btnM1m,btnM2p,btnM2m,btnM3p,btnM3m,btnOrder,btnCancel;
	@FXML Label lblamount;
	@FXML TextArea txtOrder;
	
	public int sum = 0;
	private String[] orderm = {"�Ƹ޸�ī��", "īǪġ��", "ī���"};
	private int[] countm = new int [3];
	
	private amountmodel model = new amountmodel();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		for(int i = 0; i<3; i++)
		{
			countm[i] = 0;
		}
	}
	
	public void menuAppend()
	{
		txtOrder.setText("");
		for(int i = 0; i<3; i++)
		{
			if(countm[i] != 0)
			{
				txtOrder.appendText(orderm[i] + " " + countm[i] + "��"+"\n");
			}
		}
	}
	
//	�Ƹ޸�ī�� ��ư
	public void btnM1pAction(ActionEvent event)
	{
		countm[0]++;
		menuAppend();
	}
	
	public void btnM1mAction(ActionEvent event)
	{
		if(countm[0]>0)
		{
			countm[0]--;
		}
		else
		{
			countm[0]=0;
		}
		menuAppend();
	}
	
//	īǪġ�� ��ư
	public void btnM2pAction(ActionEvent event)
	{
		countm[1]++;
		menuAppend();
	}
	public void btnM2mAction(ActionEvent event)
	{
		if(countm[1]>0)
		{
			countm[1]--;
		}
		else
		{
			countm[1]=0;
		}
		menuAppend();
	}
	
//	ī��� ��ư
	public void btnM3pAction(ActionEvent event)
	{
		countm[2]++;
		menuAppend();
	}
	public void btnM3mAction(ActionEvent event)
	{
		if(countm[2]>0)
		{
			countm[2]--;
		}
		else
		{
			countm[2]=0;
		}
		menuAppend();
	}
	
//	������ ��ư
	public void btnOrderAction(ActionEvent event)
	{
		DecimalFormat df = new DecimalFormat("#,###");
		sum = model.asum(countm);
		lblamount.setText(df.format(sum));
	}
	public void btnCancelAction(ActionEvent event)
	{
		for(int i = 0 ; i<3; i++)
		{
			countm[i] = 0;
		}
		txtOrder.setText("");
		lblamount.setText("");
	}
}