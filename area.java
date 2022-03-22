import java.util.Scanner;
public class area {
	public static void main(String[] args) {
	Scanner ob = new Scanner(System.in);
 	System.out.println("Enter the Length and Breadth:");
	int l = ob.nextInt();
	int b = ob.nextInt();
	int area=l*b;
	System.out.println("Area="+area);
  }
}
