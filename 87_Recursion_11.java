//Check if an array is sorted (Strictly increasing)

public class Recursion_11 {
    public static boolean isSorted(int[] arr, int idx){
        if(idx==arr.length-1){ //base case: if we reach the last index, the array is sorted
            return true;
        }
        if(arr[idx]>arr[idx+1]){ //if the current element is greater than the next element, the array is not sorted
            return false;
        }
        return isSorted(arr, idx+1); //recursive call for the next index
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(isSorted(arr, 0)); //start from the first index
    }
    
}
