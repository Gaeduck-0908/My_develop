package AS;

import java.util.Arrays;
import java.util.Scanner;

public class D1025 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt(); //����
		int col = sc.nextInt(); //����
		int t = 1;
		//�ʱ�ȭ
		int[][] arr = new int[row][col]; 
		
		for(int k = 0 ; k < row ; k++) 
		{
			for(int i = 0 ; i < col ; i++) 
			{
				if(t < 0)
				{
					arr[k][i] = t--;
				}
				else
				{
					arr[k][i] = t++;
				}
				t *= -1;
			}
		}

		// �ۼ���
		for(int i = 0 ; i < arr.length ; i++) 
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}