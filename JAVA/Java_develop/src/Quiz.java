import java.util.Scanner;
 
public class Quiz 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);

//		���Ҽ��� ����ִ� �迭 0�� �������ڸ�
		int[] mul = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};		
		
		
//		�ݺ�Ƚ��
		int n = sc.nextInt();
		
		for(int i = 0 ; i<n; i++)
		{
//			������溯��
			int total=0;
//			�����ڵ庯��
			int eq = 0;
//			�ֹε�Ϲ�ȣ�Է�
			String input = sc.next();
			
//			�迭���ֹε�Ϲ�ȣ ������ų �ݺ���
			for (int j=0; j < mul.length; j++)
			{
//				"-" �Ͻ� continue;
				if (j==6)
				{
					continue;
				}
//				mul[j]���� substring���� �ڸ��������ͼ� ���ϰ� ������ �־���
				total += mul[j] * Integer.parseInt(input.substring(j,(j+1)));
			}
			
//			�����ڵ� ����
			eq = 11 - total%11;
//			���ڸ����� ����°���
			eq = eq % 10;
			
			System.out.println("11307 ���������� ������\n===============================");
//			�Է¹��� ��ȣ�� �������ڸ��� �����ڵ�� ������
			if (Integer.parseInt(input.substring(13))==eq)
			{
//				���� ���ÿ� O ���
				System.out.println(eq +" O");
			}
			else
			{
//				���� ���ÿ� X ���
				System.out.println(eq +" X");
			}
		}
	}
}