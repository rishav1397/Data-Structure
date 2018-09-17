import java.util.*;
public class Availability{
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m=sc.nextInt();
		if(search(a,0,n-1,m))
			System.out.println("element found");
		else 
			System.out.println("element not found");
	}
	static boolean search(int a[],int l,int r,int m){
		if(r<l)
			return false;
		if(a[l]==m)
			return true;
		return search(a,l+1,r,m);
	}
	}