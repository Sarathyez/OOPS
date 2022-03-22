import java.lang.Math.*;
import java.util.*;
class product
{
	int pcode,price;
	String pname=new String();
	Scanner s=new Scanner(System.in);
	product()
	{
		System.out.println("Enter the product name ");
		pname=s.nextLine();
		System.out.println("Enter the product code ");
		pcode=s.nextInt();
		System.out.println("Enter the price ");
		price=s.nextInt();
	}

	public static void main(String args[])
	{
		product p1=new product();
		product p2=new product();
		product p3=new product();
		int a=Math.min(p1.price,p2.price);
		System.out.println("Minimum price is "+Math.min(a,p3.price));
	}
}

