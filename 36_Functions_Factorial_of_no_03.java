
import java.util.*;
public class Functions_Factorial_of_no {
    public static void printFactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid no");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial*=i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
}

//=====================================>O/P:-
5
120
TRACING:-
 if n=5
 i = 5 → factorial = 1 × 5 = 5
 i = 4 → factorial = 5 × 4 = 20
 i = 3 → factorial = 20 × 3 = 60
 i = 2 → factorial = 60 × 2 = 120
 i = 1 → factorial = 120 × 1 = 120
//====================================>O/P:-
-4
Invalid no
