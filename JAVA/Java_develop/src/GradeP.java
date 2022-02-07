import java.util.Scanner;

class People
{
	private String name;
	private int KorG;
	private int EngG;
	private int MathG;
	private int SumG;
	private double AvgG;
	private int RankG;
	
	void setName(String nam)
	{
		this.name = nam;
	}
	void setKorG(int kor)
	{
		this.KorG = kor;
	}
	void setEngG(int eng)
	{
		this.EngG = eng;
	}
	void setMathG(int math)
	{
		this.MathG = math;
	}
	String getName()
	{
		return this.name;
	}
	int getKor()
	{
		return this.KorG;
	}
	int getEng()
	{
		return this.EngG;
	}
	int getMath()
	{
		return this.MathG;
	}
	int getSum()
	{
		return this.getKor() + this.getEng() + this.getMath();
	}
	double getAvg()
	{
		return this.getSum()/3;
	}
	int getRank()
	{
		return 0;
	}
	void printScore()
	{
		System.out.printf("%3s %3d %3d %3d %3d %.2f \n", 
		this.getName(),this.getKor(),this.getEng(),this.getMath(),this.getSum(),this.getAvg());
	}
}

public class GradeP 
{
	public static void main(String[] args) 
	{
		People stu[] = new People[2];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i<stu.length; i++)
		{
			stu[i] = new People();
		}
		
		for(int i = 0; i < stu.length; i++)
		{
			System.out.println("성명을 입력하세요: ");
			stu[i].setName(input.next());
			System.out.println("국어 점수를 입력하세요");
			stu[i].setKorG(input.nextInt());
			System.out.println("영어 점수를 입력하세요");
			stu[i].setEngG(input.nextInt());
			System.out.println("수학 점수를 입력하세요");
			stu[i].setMathG(input.nextInt());
		}
		
		System.out.println("============출력===========");
		for(int i = 0; i < stu.length; i++)
		{
			stu[i].printScore();
		}
	}
}
