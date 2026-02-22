//Taking an array as input from the user.Search for a given number X and printing the index at which it occurs.

import java.util.*;
public class Array {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       int nums[]=new int[size];
       for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
       }
       int x=sc.nextInt();
       for(int i=0;i<nums.length;i++){
        if(nums[i]==x){
            System.out.println("X found at index: "+i);
        }
       }
    }
}


//=================================================================================>O/P:-
4//---------->Array size
7
6
4 
6
6//------------->To find means X
X found at index: 1
X found at index: 3
