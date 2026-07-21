
//print all the subsets of a set of first n natural numbers
public class Recursion_23 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("Subsets of the set {1, 2, ..., " + n + "}:");
        printSubsets(n, "", 1);
    }

    public static void printSubsets(int n, String current, int index) {
        if (index > n) {
            System.out.println(current);
            return;
        }

        // Include the current number in the subset
        printSubsets(n, current + index + " ", index + 1);

        // Exclude the current number from the subset
        printSubsets(n, current, index + 1);
    }
}
