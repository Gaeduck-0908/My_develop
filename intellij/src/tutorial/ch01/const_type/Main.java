package tutorial.ch01.const_type;

public class Main {
	public static void main(String[] args) {
		// 상수 사용하기
		final double PI = 3.14159265358979323846264338327;
		final int MAX_STUDENT_NUM = 100;
		final int MIN_NUM = 0;
		final int NUM_OF_PLAYER = 3;

		System.out.println("파이는 "  +  PI);

//		PI = 3.141111;



		int count = 0;
		if( count <= MAX_STUDENT_NUM) {

		} else if(count >= MIN_NUM) {
			int a = 0;
			if(a == NUM_OF_PLAYER) {
				System.out.println("");
			}
		}

		count = 0;
		if( count <= 100) {

		} else if(count >= 0) {
			int a = 0;
			if(a == 3) {
				System.out.println("");
			}
		}
	}
}








