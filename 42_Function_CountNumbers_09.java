import java.util.Scanner;

public class CountNumbers {

    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);

        int positive = 0, negative = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nCount of Positive numbers = " + positive);
        System.out.println("Count of Negative numbers = " + negative);
        System.out.println("Count of Zeros = " + zero);
    }

    public static void main(String[] args) {
        countNumbers();   // function call
    }
}


//==============================================================>O/P:-
Enter a number: 6
Do you want to continue? (y/n): y
Enter a number: 0
Do you want to continue? (y/n): y
Enter a number: -9
Do you want to continue? (y/n): n

Count of Positive numbers = 1
Count of Negative numbers = 1
Count of Zeros = 1
