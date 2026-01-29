

import java.util.*;
public class Function_circumference_of_circle {
   public static Double getCircumference(Double radius) {
       return 2 * 3.14 * radius;
   }
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Double radius = sc.nextDouble();
      System.out.println(getCircumference(radius));
   }   
}


//====================================================================>O/P:-
4
25.12
