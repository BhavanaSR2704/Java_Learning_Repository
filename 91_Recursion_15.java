
//Remove duplicates in a string
public class Recursion_15 {
    public static String removeDuplicates(String str) {
        // Base case: if the string is empty or has one character, return it
        if (str.length() <= 1) {
            return str;
        }
        // Recursively remove duplicates from the substring
        String restOfString = removeDuplicates(str.substring(1));
        // If the first character is the same as the first character of the rest of the string, skip it
        if (str.charAt(0) == restOfString.charAt(0)) {
            return restOfString;
        } else {
            // Otherwise, include the first character and concatenate with the rest of the string
            return str.charAt(0) + restOfString;
        }
    }

    public static void main(String[] args) {
        String str1 = "aabbcc";
        String str2 = "abcde";
        String str3 = "aabbaa";

        System.out.println(removeDuplicates(str1)); // abc
        System.out.println(removeDuplicates(str2)); // abcde
        System.out.println(removeDuplicates(str3)); // ab
    }
}
    
