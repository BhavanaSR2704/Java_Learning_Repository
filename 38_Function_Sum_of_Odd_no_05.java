
import java.util.*;
public class Function_Sum_of_Odd_no {
   public static void printSum(int n) {
       int sum = 0;
       for(int i=1; i<=n; i++) {
         if(i % 2 != 0) {
            sum = sum + i;
        }
      }
      System.out.println(sum);
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printSum(n);
   }   
}


//===============================================>O/P:-
7
16
  
if n=7
  (odd num = 1,3,5,7)
  sum=0
  sum=1
  sum=4
  sum=9
  sum=16
