//count total paths in a maze to move from(0,0) to (n,m)
public class Recursion_20 {
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println("Total paths in a maze of size " + n + "x" + m + ": " + countPaths(n, m));
    }

    public static int countPaths(int n, int m) {
        if (n == 1 || m == 1) {
            return 1; // Only one way to reach the destination if either row or column is 1
        }
        return countPaths(n - 1, m) + countPaths(n, m - 1); // Move down or right
    }
}
