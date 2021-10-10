package AS;

import java.util.Scanner;

public class D0928 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		make(i);
		sc.close();
	}
	
	public static void make(int len)
	{
		String str= "ABCDEFGHIJKLMNOPQRSTUVWXYZ123";
		for (int k = 0; k<len; k++)
		{
			int i = (int)(Math.random() * str.length());
			System.out.print(str.charAt(i));
		}
	}
}