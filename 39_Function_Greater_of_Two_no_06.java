

import java.util.*;
public class Function_Greater_of_Two_no  {
   public static int getGreater(int a, int b) {
      if(a > b) {
          return a;
      } 
      else {
          return b;
      }
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int result=getGreater(a, b);
      System.out.println("Greater Number is:"+result);
   }   
}
