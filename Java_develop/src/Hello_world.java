import java.util.Scanner;

public class Hello_world 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int num = 0;
		int [][] array = new int [n1][n2];
		
		for(int i = 0; i < n1; i++)
		{
			for(int j = 0; j < n2; j++)
			{
				array[i][j] = num;
				num++;
			}
		}
		
		for(int i = 0; i < n1; i++)
		{
			for(int j = 0 ; j < n2; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}