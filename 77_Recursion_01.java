
//Recursion means a function calling itself 
//When recursion occur it stores in Stack





//Print the numbers 5 to 1

public class Recursion_01 {
    public static void printnumber(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printnumber(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        printnumber(n);
    }
}
