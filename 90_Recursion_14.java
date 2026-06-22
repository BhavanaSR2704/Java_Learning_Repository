
//Check if an array is sorted(Strictly increasing)

public class Recursion_14 {
    public static boolean isSorted(int[] arr, int index) {
        // Base case: if we've reached the last element, the array is sorted
        if (index == arr.length - 1) {
            return true;
        }
        // Check if current element is less than the next element
        if (arr[index] < arr[index + 1]) {
            // Recursively check the rest of the array
            return isSorted(arr, index + 1);
        } else {
            // If not sorted, return false
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        System.out.println(isSorted(arr1, 0)); // true
        System.out.println(isSorted(arr2, 0)); // false
    }
}
