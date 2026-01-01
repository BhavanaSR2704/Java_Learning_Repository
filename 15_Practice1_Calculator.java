import java.util.*;
class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter Choice:");
        char choice=sc.next().charAt(0);
        switch(choice){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a+b);
            break;
            case '*':System.out.println(a+b);
            break;
            case '/':System.out.println(a+b);
            break;
            case '%':System.out.println(a+b);
            break;
            default:System.out.println("You entered wrong choice");

        }
    }
}
