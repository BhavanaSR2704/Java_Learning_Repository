
//print keypad combinations using recursion
public class Recursion_18 {

    public static void main(String[] args) {
        String digits = "23";
        printKeypadCombinations(digits, "", 0);
    }

    public static void printKeypadCombinations(String digits, String current, int index) {
        if (index == digits.length()) {
            System.out.println(current);
            return;
        }

        String[] keypad = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };

        int digit = Character.getNumericValue(digits.charAt(index));
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            printKeypadCombinations(digits, current + letters.charAt(i), index + 1);
        }
    }
}
