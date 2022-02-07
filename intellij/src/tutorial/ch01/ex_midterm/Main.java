package tutorial.ch01.ex_midterm;

public class Main {
	public static void main(String[] args) {
		int korean = 95;
		int english = 97;
		int math = 88;
		int history = 65;
		int iTotal = 0;
		double dAverage = 0.0;
		char cHakjum = 'F';

		iTotal = korean + english + math + history;
		dAverage = iTotal / 4.0;

		if(dAverage > 90 && dAverage <= 100) {
			cHakjum = 'A';
		} else if(dAverage > 80 && dAverage <= 90) {
			cHakjum = 'B';
		} else if(dAverage > 70 && dAverage <= 80) {
			cHakjum = 'C';
		} else if(dAverage > 60 && dAverage <= 70) {
			cHakjum = 'D';
		}

		switch(cHakjum) {
			case 'A':
				System.out.println("성적 우수상");
				break;
			case 'B':
				System.out.println("장려상");
				break;
			default:
				System.out.println("격려상");
				break;
		}
	}
}
