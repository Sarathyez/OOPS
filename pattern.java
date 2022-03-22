import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		int n,i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{

			for(j=0;j<i;j++)
				System.out.print(i+" ");
			System.out.println(" ");
		}
	}
}

		

