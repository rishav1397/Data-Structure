import java.util.*;
public class freq{
	public static void main(String[] ar){
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char c[]=st.toCharArray();
		int max=-1,p=0;
		int c1[]=new int[c.length];
         for(int i=0;i<c.length;i++){
          for(int j=i+1;j<c.length;j++){
            if(c[i]==c[j])
                c1[i]+=1;
               }
             if(max<c1[i]){
                  max=c1[i];
                  p=i;
                 }
              }
          System.out.println("Hightest occuring element is "+c[p]);
	}
}