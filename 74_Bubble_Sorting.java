
import java.util.*;
public class Bubble_Sorting {
    public static void printArray (int[] arr) {//function to print Arraylist
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
      //loop for sorting
            for(int i=0;i<arr.length-1;i++){//n-1
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        //swap
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                    }
                }
            }
            printArray(arr);
        }
    }



