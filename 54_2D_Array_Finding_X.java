import java.util.*;
public class TwoDArray {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int [][]numbers=new int[rows][cols];
        //input
        //rows
        for(int i=0;i<rows;i++){
            //column
            for(int j=0;j<cols;j++){
                numbers[i][j]=sc.nextInt();
            }
            
        }
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                System.out.println("X found at("+ i +","+ j +")");
                }
            }    
        }
    }
}
//=================================================>O/P:-
3
3
1 2 3 
4 5 6
7 5 9
5
X found at(1,1)
X found at(2,1)
