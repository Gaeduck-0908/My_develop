import java.util.Scanner;

class Info
{
	String name; //�������̸�
	String itemname; //��ǰ��
	int itemPrice; //��ǰ�ܰ�
	int itemAmount; //��ǰ ����
	
	void setname(String inname)
	{
		this.name = inname;
	}
	void setitemname(String initemname)
	{
		this.itemname = initemname;
	}
	void setprice(int inprice)
	{
		this.itemPrice = inprice;
	}
	void setamount(int inamount)
	{
		this.itemAmount = inamount;
	}
	String getname()
	{
		return this.name;
	}
	String getitemname()
	{
		return this.itemname;
	}
	int getprice()
	{
		return this.itemPrice;
	}
	int getitemamount()
	{
		return this.itemAmount;
	}
	int getSum()
	{
		return this.itemPrice * this.itemAmount;
	}
	
	void print()
	{
		System.out.printf("%s %s %d %d %d \n",getname(),getitemname(),getprice(),getitemamount(),getSum());
	}
	
}

public class Buy 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Info user = new Info();
		
		System.out.println("������ �̸�:");
		String name = sc.nextLine();; //�������̸�
		System.out.println("������ ��ǰ�� :");
		String itemname = sc.nextLine(); //��ǰ��
		System.out.println("�ش� ������ ��ǰ�ܰ� :");
		int itemPrice = sc.nextInt(); //��ǰ�ܰ�
		System.out.println("������ ��ǰ ���� :");
		int itemAmount = sc.nextInt(); //��ǰ ����
		
		user.setname(name);
		user.setitemname(itemname);
		user.setprice(itemPrice);
		user.setamount(itemAmount);
		
		user.print();
		
	}
}