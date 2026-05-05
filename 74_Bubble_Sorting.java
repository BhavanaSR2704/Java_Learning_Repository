
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
            for(int i=0;i<arr.length-1;i++){//n-1   controls passes
                for(int j=0;j<arr.length-i-1;j++){    //controls actual comparison
                    if(arr[j]>arr[j+1]){
                        //swap
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            printArray(arr);
        }
    }



