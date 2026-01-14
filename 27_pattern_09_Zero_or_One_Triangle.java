
public class Zero_or_One_Triangle {
    public static void main(String[] args) {
        int n=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}

//=============================================>O/P:-
 1 
 0  1 
 1  0  1 
 0  1  0  1 
 1  0  1  0  1 
