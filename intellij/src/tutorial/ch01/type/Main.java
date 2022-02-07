package tutorial.ch01.type;

public class Main {
	public static void main(String[] args) {
		/*
		* byte  short  int  long
		* char  float  double  boolean
		* */
		byte bByte = 100;
		short sShort = 100;
		int iInt = 100;
		long lLong = 10000000000000000L;
		char cChar = 'a';
		float fFloat = 3.14F;
		double dDouble = 3.141592;
		boolean bBoolean = true;
		bBoolean = false;
		System.out.println(
				bByte + " "
				+ sShort + " "
				+ iInt + " "
				+ lLong + " "
				+ cChar + " "
				+ fFloat + " "
				+ dDouble + " "
				+ bBoolean
		);

	}
}
