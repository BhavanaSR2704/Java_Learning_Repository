public class JavaLoopsExample {

    public static void main(String[] args) {

        //  FOR LOOP
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println(); // blank line


        //  WHILE LOOP
        System.out.println("While Loop Example:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println(); // blank line


        //  DO-WHILE LOOP
        System.out.println("Do-While Loop Example:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        System.out.println(); // blank line


        //  FOR-EACH LOOP
        System.out.println("For-Each Loop Example:");
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

