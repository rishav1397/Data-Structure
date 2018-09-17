import java.util.Scanner;
public class power 
{
	private static int a;
	power(int b)
	{
		a = b;
	}
	public static int powerfind(int x,int y)
	{
		if(y == 0) return x/a;
		return powerfind(x*a,--y);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the x");
		int x = sc.nextInt();
		System.out.println("Enter the y");
		int y = sc.nextInt();
		power o = new power(x);
		int r = o.powerfind(x,y);
		System.out.println("The ans is "+r);
	}
}