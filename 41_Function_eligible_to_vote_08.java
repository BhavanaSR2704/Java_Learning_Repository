
import java.util.*;
public class Function_eligible_to_vote {
   public static boolean isElligible(int age) {
       if(age > 18) {
           return true;
       }
       return false;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      System.out.println(isElligible(age));
   }   
}

//=============================>O/P:-
24
true
