import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to give it's tabels:");
        int n=sc.nextInt();
        for(int i=1;i<11;i++){
            System.out.println(i*n);
        }
    }
    
}
