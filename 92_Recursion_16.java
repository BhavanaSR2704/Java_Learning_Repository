// print all the subsequences of a string
public class Recursion_16 {
    public static void printSubsequences(String str, String current, int index) {
        // Base case: if the index reaches the length of the string, print the current subsequence
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        // Include the current character and move to the next index
        printSubsequences(str, current + str.charAt(index), index + 1);
        // Exclude the current character and move to the next index
        printSubsequences(str, current, index + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "", 0);
    }
}






