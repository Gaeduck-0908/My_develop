import java.util.Scanner;
 
public class Quiz 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);

//		곱할수가 담겨있는 배열 0은 하이픈자리
		int[] mul = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};		
		
		
//		반복횟수
		int n = sc.nextInt();
		
		for(int i = 0 ; i<n; i++)
		{
//			총점담길변수
			int total=0;
//			검증코드변수
			int eq = 0;
//			주민등록번호입력
			String input = sc.next();
			
//			배열과주민등록번호 대조시킬 반복문
			for (int j=0; j < mul.length; j++)
			{
//				"-" 일시 continue;
				if (j==6)
				{
					continue;
				}
//				mul[j]값과 substring으로 자릿수가져와서 곱하고 총점에 넣어줌
				total += mul[j] * Integer.parseInt(input.substring(j,(j+1)));
			}
			
//			검증코드 생성
			eq = 11 - total%11;
//			한자릿수로 만드는과정
			eq = eq % 10;
			
			System.out.println("11307 성일정보고 김태한\n===============================");
//			입력받은 번호의 마지막자리가 검증코드와 같은지
			if (Integer.parseInt(input.substring(13))==eq)
			{
//				값과 동시에 O 출력
				System.out.println(eq +" O");
			}
			else
			{
//				값과 동시에 X 출력
				System.out.println(eq +" X");
			}
		}
	}
}