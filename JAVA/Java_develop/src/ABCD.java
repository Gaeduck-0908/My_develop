import java.util.Scanner;

public class ABCD 
{
	public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        int tempst = 0, tempen = 0;
        int a = 0;
        int b = 0;
        int StartCount = 1, EndCount = 1;

        while (true) 
        {
            a = sc.nextInt();
            b = sc.nextInt();
            
            if (a >= 2 && b >= 2 && a <= 100000 && b <= 100000 && a < b) 
            {
            	break;
            }
            
            else 
            {
            	System.out.println("입력 오류");
            }
        }
        tempst = a;
        tempen = b;

        while (tempst != 1) 
        {
            if (tempst % 2 == 0) {tempst /= 2;}
            else {tempst = tempst * 3 + 1;}
            StartCount++;
        }

        while (tempen != 1) 
        {
            if (tempen % 2 == 0) {tempen /= 2;}
            else {tempen = tempen * 3 + 1;}
            EndCount++;
        }
        
        if(StartCount < EndCount) 
        {
        	System.out.println(b + " " + EndCount);
        }
        
        else
        {
        	System.out.println(a + " " + StartCount);
        }

    }
}