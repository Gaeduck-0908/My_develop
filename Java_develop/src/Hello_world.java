import java.util.Scanner;

public class Hello_world 
{
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		
		String [] name = new String[3]; //이름 담을 배열
		int [][]score = new int [3][3]; //점수담을 2차원 배열
		
		int [] sum = new int [3]; //합계 담을 배열
		
		int [] rank = new int [3]; //등수 담을 배열
		
		//이름 담기
		System.out.println("학생들의 이름을 입력해주세요");
		for (int i=0; i <name.length; i++)
		{
			name[i] = sc.nextLine(); 
		}
		
		//점수 담기
		for (int i = 0; i< score.length; i ++)
		{
			System.out.println(name[i] + "의 점수를 입력해주십시오");
			for (int j = 0; j < 3; j++)
			{
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
		}
		
		//순서대로 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t석차");
		for (int i = 0; i < 3; i++)
		{
			rank[i] = 1;
			
			int [] cycle = score[i];
			System.out.print(name[i] + "\t");
			
			for (int j = 0; j < cycle.length; j++)
			{
				if (sum[i] < sum[j])
				{
					rank[i]++;
				}
				System.out.print(cycle[j] + "\t" );
			}
			System.out.print(sum[i] + "\t");
			System.out.println(rank[i]);
		}
    }
}