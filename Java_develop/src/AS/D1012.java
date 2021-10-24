package AS;

public class D1012 
{
	 public static void main(String[] args) 
	 {
		for(int i=1; i<=9; i++)
		{
			System.out.print(i+"´Ü\t"); // \t Ä­ °£°Ý ¹ú¸²
		}
		System.out.println();
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}