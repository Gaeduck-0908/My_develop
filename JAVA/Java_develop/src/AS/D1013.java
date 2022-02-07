package AS;

import java.util.Scanner;

public class D1013 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i <= t; i++) { //4줄 생성
			for (int j = 3; j >=0; j--) { //j가 0보다 크나거나 같다면
				if (i<j) { //참이면 빈칸에 공백 출력
					System.out.print(" ");
				}else {	//거짓이면 별 출력
					System.out.print("*");
				}
			}
	        System.out.println();
		}
	}
}