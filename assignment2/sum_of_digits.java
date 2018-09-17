import java.util.Scanner;
public class sum_of_digits
{
	public static int sum(int n)
	{
		if(n <= 0) return 0;
		return (n % 10 + sum(n/10));

	}
	public static void main(String args[])
	{
		int c = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String s = sc.next();
		int a = Integer.parseInt(s);
		int r = sum(a);
		System.out.println("sum is "+ r);
	}
}