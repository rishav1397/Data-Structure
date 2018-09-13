import java.util.*;
class subseq{
     static Scanner sc=new Scanner(System.in);
     static void seq(String str,String st){
      if(st.length()<0)
      return;

      System.out.println(str);
      for(int i=0;i<st.length();i++)
       seq(str+st.charAt(i),st.substring(i+1,st.length()));
  }


       public static void main (String args[]){
        String str=sc.nextLine();
          seq("",str);
          }
        }
