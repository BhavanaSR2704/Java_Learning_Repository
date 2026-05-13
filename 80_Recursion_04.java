// Printing factorial of a number n


public class Recursion_04 {
    public static int calfactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fac_n_min_1=calfactorial(n-1);
        int fac_n=n*fac_n_min_1;
        return fac_n;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=calfactorial(n);
        System.out.println(ans);
    }
}
