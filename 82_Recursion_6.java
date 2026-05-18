//Print X^n(Stack height=n)

public class Recursion_6 {
    public static int  calpower(int x,int n){
        if(n==0){ //base case 1
            return 1;
        }
        if(x==0){ //base case 2
            return 0;
        }
        int xpowerm1=calpower(x,n-1); //work
        int xpowern=x * xpowerm1;
        return xpowern;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calpower(x,n);
        System.out.println(ans);
    }
}

