
// printing all the unique subsequences of a string using recursion
public class Recursion_17 {

    public static void main(String[] args) {
        String str = "abc";
        printSubsequences(str, "", 0);
    }

    public static void printSubsequences(String str, String current, int index) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include the current character
        printSubsequences(str, current + str.charAt(index), index + 1);

        // Exclude the current character
        printSubsequences(str, current, index + 1);
    }
}
