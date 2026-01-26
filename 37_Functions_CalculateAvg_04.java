

import java.util.*;
public class Function_CalculateAvg {
    public static int CalculateAvg(int a, int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(); 
        int b=sc.nextInt(); 
        int c=sc.nextInt();
        int avg=CalculateAvg(a,b,c);
        System.out.println("Avg of 3 numbers is:"+avg);
    }
}


//=======================================>O/P:-
8
7
3
Avg of 3 numbers is:6
