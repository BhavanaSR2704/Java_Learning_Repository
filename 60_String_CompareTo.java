public class Main {
    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "Banana";

        System.out.println(s1.compareTo(s2)); // negative value
        System.out.println(s2.compareTo(s1)); // positive value
        System.out.println(s1.compareTo("Apple")); // 0
    }
}
