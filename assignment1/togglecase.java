import java.util.*;
class togglecase{
             static Scanner sc=new Scanner(System.in);
              public static void main(String args[]){
                    String st=sc.nextLine();
                    char a[]=st.toCharArray();
                    for(int i=0;i<a.length;i++){
                     if(Character.isUpperCase(a[i])){
                        a[i]=Character.toLowerCase(a[i]);
                     }
                     else
                       a[i]=Character.toUpperCase(a[i]);
                     }
                 String str=new String(a);
                 System.out.println(str);
               }
}
