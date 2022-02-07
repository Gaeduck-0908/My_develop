package tutorial.ch01.ex_square;

public class Main {
	public static void main(String[] args) {
		int w = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);

		for(int i=1; i<=h; i++) {
			for(int j=1; j<=w; j++) {
				if(i==1  || i==h) {  // 첫번째줄과 마지막째 줄은 모든 열 꽉 채워 출력함(예)************
					System.out.print("*");
				} else { // 나머지 줄은 처음과 마지막 열만 출력함(예)*             *
					if(j==1 || j==w) { // 첫번쨰 열과 마지막 열만 출력함
						System.out.print("*");
					} else { // 나머지 열은 공백( )
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}
