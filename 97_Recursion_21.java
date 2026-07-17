
//Place tiles of size 1xM in a floor of size NxM
public class Recursion_21 {
    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println("Total ways to place tiles of size 1x" + m + " in a floor of size " + n + "x" + m + ": " + countWays(n, m));
    }

    public static int countWays(int n, int m) {
        if (n < m) {
            return 1; // Only one way to place tiles if the floor length is less than tile length
        }
        if (n == m) {
            return 2; // Two ways: either place all tiles vertically or horizontally
        }
        return countWays(n - 1, m) + countWays(n - m, m); // Place tile vertically or horizontally
    }
}
