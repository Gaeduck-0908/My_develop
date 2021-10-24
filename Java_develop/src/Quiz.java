import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
 
public class Quiz 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        for(int i = 0; i<max; i++)
        {
        	try
        	{
        		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        		String date1 = sc.nextLine();
        		String date2 = sc.nextLine();
        		
        		Date date3 = format.parse(date1);
        		Date date4 = format.parse(date2);
        		
        		long resultdate = date4.getTime() - date3.getTime();
        		
        		long result = Math.abs(resultdate);
        		
        		System.out.println(result);
        		
        		
        	}
        	catch(Exception e)
        	{
        		
        	}
        }
    }
}