import java.util.*;
class rectangle
{
 	int l,b,area;
	Scanner s=new Scanner(System.in);
	void area(int l1,int b1)
	{
		l=l1;
		b=b1;
		area=l*b;
		System.out.println("The area is "+area);	
	}
}
class rect
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		rectangle x=new rectangle();
		r.area(5,4);
		x.area(10,5);
	}
}
	

