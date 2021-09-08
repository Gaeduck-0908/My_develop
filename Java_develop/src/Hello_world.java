import java.util.Scanner;

public class Hello_world 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String [] name = new String[3];
		int [][]score = new int [3][3];
		
		int [] sum = new int [3];
		
		System.out.println("학생들의 이름을 입력해주세요");
		for (int i=0; i <name.length; i++)
		{
			name[i] = sc.nextLine();
		}
		
		
		for (int i = 0; i< score.length; i ++)
		{
			System.out.println(name[i] + "의 점수를 입력해주십시오");
			for (int j = 0; j < 3; j++)
			{
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
		}

		for (int n = 0; n < 3; n++)
		{
			int [] cycle = score[n];
			System.out.print(name[n] + " ");
			
			for (int x = 0; x < cycle.length; x++)
			{
				System.out.print(cycle[x] + " " );
			}
			System.out.print(sum[n]);
			
			System.out.println();
		}
    }
}