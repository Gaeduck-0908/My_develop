package tutorial.ch01.ex_shape;
import java.util.Scanner;

public class Main
{
	final public static Scanner sc = new Scanner(System.in);
	public static String cli = "";

	public static void main(String[] args)
	{
// CLI : Command Line Interface

		while (!cli.equals("q"))
		{
// 메뉴 만들기
			System.out.print("출력할 도형을 선택하세요\n" +
					"1.사각형\t2.삼각형\t3.다이아몬드\tq.종료\n" +
					"> ");
			cli = sc.nextLine();

			if (cli.equals("1"))
			{
// 사각형 출력
				print_square();
			}

			else if (cli.equals("2"))
			{
// 삼각형 출력
				print_triangle();
			}

			else if (cli.equals("3"))
			{
// 다이아몬드 출력
				print_diamond();
			}
		}

		sc.close();
	}

	public static void print_square() {
		System.out.print("사각형의 너비를 입력하세요 : ");
		int w = sc.nextInt();
		System.out.print("사각형의 높이를 입력하세요 : ");
		int h = sc.nextInt();

		for (int i = 1; i <= h; i++)
		{
			for (int j = 1; j <= w; j++)
			{
				if (i == 1 || i == h)
				{ // 첫번째줄과 마지막째 줄은 모든 열 꽉 채워 출력함(예)************
					System.out.print("*");
				}
				else
				{ // 나머지 줄은 처음과 마지막 열만 출력함(예)* *
					if (j == 1 || j == w)
					{ // 첫번쨰 열과 마지막 열만 출력함
						System.out.print("*");
					}
					else
					{ // 나머지 열은 공백( )
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}

	public static void print_triangle()
	{
		System.out.print("삼각형의 높이를 입력하세요 : ");
		int h = sc.nextInt();

		for (int i = 0; i < h; i++)
		{
// 공백 출력
			for (int j = 1; j < h - i; j++)
			{
				System.out.print(" ");
			}

// 별 출력
			for (int j = 0; j < i * 2 + 1; j++)
			{
				System.out.print("*");
			}
// 한줄 띄우기
			System.out.println("");
		}
	}

	public static void print_diamond()
	{
		System.out.print("다이아몬드의 높이 /2를 입력해주세요");
		int h = sc.nextInt();

		for (int i=0; i<h; i++)
		{
			for (int j=1; j<h-i; j++)
			{
				System.out.print(" ");
			}
			for (int j=0; j<i*2+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i=h-1; i>0; i--)
		{
			for (int j=h-i; j>0; j--)
			{
				System.out.print(" ");
			}
			for (int j=i*2-1; j>0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void menu() {

	}
}
