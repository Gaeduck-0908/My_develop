import java.util.Scanner;

class Info
{
	String name; //구매자이름
	String itemname; //상품명
	int itemPrice; //상품단가
	int itemAmount; //상품 수량
	
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
		
		System.out.println("구매자 이름:");
		String name = sc.nextLine();; //구매자이름
		System.out.println("구매할 상품명 :");
		String itemname = sc.nextLine(); //상품명
		System.out.println("해당 물건의 상품단가 :");
		int itemPrice = sc.nextInt(); //상품단가
		System.out.println("구매할 상품 수량 :");
		int itemAmount = sc.nextInt(); //상품 수량
		
		user.setname(name);
		user.setitemname(itemname);
		user.setprice(itemPrice);
		user.setamount(itemAmount);
		
		user.print();
		
	}
}