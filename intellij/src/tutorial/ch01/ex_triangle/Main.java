package tutorial.ch01.ex_triangle;

public class Main {
	public static void main(String[] args) {
		int h = Integer.parseInt(args[0]);

		for(int i=0; i<h; i++) {
			// 공백 출력
			for(int j=1; j<h-i; j++) {
				System.out.print(" ");
			}

			// 별 출력
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			// 한줄 띄우기
			System.out.println("");
		}
	}
}
