package AS;

import java.util.Arrays;
import java.util.Scanner;

public class D1014 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("����л�?");
		int num = sc.nextInt();
		int [] student = new int[num];
		
		for(int i = 0; i<student.length; i++)
		{
			System.out.println(i+1 + "��° ����");
			student[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(student));
	}
}