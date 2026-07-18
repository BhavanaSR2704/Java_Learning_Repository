//Find the number of ways in which you can invite n people to your party,single or in pairs
public class Recursion_22 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total ways to invite " + n + " people to the party: " + countWays(n));
    }

    public static int countWays(int n) {
        if (n <= 1) {
            return 1; // Only one way to invite if there is 0 or 1 person
        }
        return countWays(n - 1) + (n - 1) * countWays(n - 2); // Invite one person or pair them up
    }
}
