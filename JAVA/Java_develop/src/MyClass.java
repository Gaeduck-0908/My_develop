public class MyClass 
{
    public static void main(String args[]) 
    {
    	int i,j;
    	for(i = 1; i <= 100; i++)
    	{
    		j = 0;
    		for(j = 2; j <= i; j++)
    		{
    			if(i % j == 0)
    			{
    				break;
    			}
    		}
    		if (i==j)
    		{
    			System.out.println("소수 출력 : " + i);
    		}
    	}
    }
    
    private static void Prime_Number()
    {
    	int i,j;
    	for(i = 1; i <= 100; i++)
    	{
    		j = 0;
    		for(j = 2; j <= i; j++)
    		{
    			if(i % j == 0)
    			{
    				break;
    			}
    		}
    		if (i==j)
    		{
    			System.out.println("소수 출력 : " + i);;
    		}
    	}
    }
}