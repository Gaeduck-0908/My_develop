package application;

public class amountmodel 
{
	public int asum(int[] ctm)
	{
		int sumt=0;
		int m=0;
		
		for(int i = 0; i<3; i++)
		{
			if(i==0)
			{
				m = 1000;
			}
			if(i==1)
			{
				m = 2000;
			}
			if(i==2)
			{
				m = 3000;
			}
			sumt = sumt + ctm[i] * m;
		}
		return sumt;
	}
}
