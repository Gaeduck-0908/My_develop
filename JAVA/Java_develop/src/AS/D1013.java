package AS;

import java.util.Scanner;

public class D1013 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i <= t; i++) { //4�� ����
			for (int j = 3; j >=0; j--) { //j�� 0���� ũ���ų� ���ٸ�
				if (i<j) { //���̸� ��ĭ�� ���� ���
					System.out.print(" ");
				}else {	//�����̸� �� ���
					System.out.print("*");
				}
			}
	        System.out.println();
		}
	}
}