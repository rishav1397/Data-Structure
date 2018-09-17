import java.util.*;
public class Reverse{
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		reverse(a,0,n-1);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	public static void reverse(int a[],int s,int e){
		if(e<0)
			return;
		if(s<e){
			swap(a,s,e);
			reverse(a,++s,--e);
		}
	}
	public static void swap(int a[],int s,int e){
		int temp=a[s];
		a[s]=a[e];
		a[e]=temp;
	}
}