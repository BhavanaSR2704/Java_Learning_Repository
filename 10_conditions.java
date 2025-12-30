
//if,else if ,else for finding greater,lesser or equal number

import java.util.*;
public class conditions {
    public static void main(String[] args){
        Scanner sn=new Scanner (System.in);
        int num1=sn.nextInt();
        int num2=sn.nextInt();
        if(num1==num2){
            System.out.println("Equal");
        }
        else if(num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num1 is lesser than num2");
        }
        }
    }
    
