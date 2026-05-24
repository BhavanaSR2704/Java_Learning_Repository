//Print X^n(Stack height=logn)



public class Recursion_7 {
    public static int  calpower(int x,int n){
        if(n==0){ //base case 1
            return 1;
        }
        if(x==0){ //base case 2
            return 0;
        }
       if(n%2==0){// for even
        return calpower(x, n/2) * calpower(x,n/2);
       }
       else{ // for odd
        return calpower(x, n/2) * calpower(x,n/2)*x;
       }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calpower(x,n);
        System.out.println(ans);
    }
}

