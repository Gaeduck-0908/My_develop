import java.util.Scanner;

public class Hello_world 
{
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		
		String [] name = new String[3]; //�̸� ���� �迭
		int [][]score = new int [3][3]; //�������� 2���� �迭
		
		int [] sum = new int [3]; //�հ� ���� �迭
		
		int [] rank = new int [3]; //��� ���� �迭
		
		//�̸� ���
		System.out.println("�л����� �̸��� �Է����ּ���");
		for (int i=0; i <name.length; i++)
		{
			name[i] = sc.nextLine(); 
		}
		
		//���� ���
		for (int i = 0; i< score.length; i ++)
		{
			System.out.println(name[i] + "�� ������ �Է����ֽʽÿ�");
			for (int j = 0; j < 3; j++)
			{
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			}
		}
		
		//������� ���
		System.out.println("�̸�\t����\t����\t����\t�հ�\t����");
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