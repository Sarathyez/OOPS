import java.util.*;
class rectangle
{
 	int l,b,p;
	Scanner s=new Scanner(System.in);
	rectangle()
	{
		System.out.println("Enter the length and breadth ");
		l=s.nextInt();
		b=s.nextInt();
		p=2*(l+b);
		System.out.println("The perimeter is "+p);
	}
	rectangle(int l1,int b1)
	{
		l=l1;
		b=b1;
		p=2*(l+b);
		System.out.println("The perimeter is "+p);	
	}
}
class peri
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		rectangle x=new rectangle(5,4);
	}
}

