import java.util.Scanner;
public class Fibbonaci
{
	public static int fibbo(int n)
	{
		if(n == 0 || n == 1) return n;
		return fibbo(n - 1) + fibbo(n - 2); 
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f = fibbo(n);
		System.out.println(n+"th number is "+f);
	}
}