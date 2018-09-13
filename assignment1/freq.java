import java.util.*;
public class freq{
  public static char highestFreq(String str)
  {
    char c[]=str.toCharArray();
    int max=-1,k=0;
    int c1[]=new int[c.length];
         for(int i=0;i<c.length;i++){
          for(int j=i+1;j<c.length;j++){
            if(c[i]==c[j])
                c1[i]+=1;
               }
             if(max<c1[i]){
                  max=c1[i];
                  k=i;
                 }
              }
          return c[k];
    
  }
	public static void main(String[] ar){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
    char h = highestFreq(str);
    System.out.println("Highest frequency is of "+h);
	}
}
