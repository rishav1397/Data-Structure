import java.util.*;
public class palindrome{
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int l=(st.length())-1;
		char c[]=st.toCharArray();
		int f=0;
		for(int i=0;i<st.length()/2;i++){
			if(c[i]!=c[l--]){
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
}