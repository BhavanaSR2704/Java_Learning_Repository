
//Find the 1st and last occurance of an element in string using recursion
public class Recursion_13 {
    public static void main(String[] args) {
        String str="abcaabcda";
        char target='a';
        int firstIndex=findFirstOccurrence(str, target, 0);
        int lastIndex=findLastOccurrence(str, target, str.length()-1);
        System.out.println("First Occurrence of '" + target + "' is at index: " + firstIndex); // Output: 0
        System.out.println("Last Occurrence of '" + target + "' is at index: " + lastIndex); // Output: 7
    }

    public static int findFirstOccurrence(String str, char target, int idx){
        if(idx==str.length()){ //base case: if we reach the end of the string
            return -1; //return -1 if the target is not found
        }
        if(str.charAt(idx)==target){ //if the current character matches the target
            return idx; //return the current index
        }
        return findFirstOccurrence(str, target, idx+1); //recursive call for the next index
    }

    public static int findLastOccurrence(String str, char target, int idx){
        if(idx<0){ //base case: if we reach the beginning of the string
            return -1; //return -1 if the target is not found
        }
        if(str.charAt(idx)==target){ //if the current character matches the target
            return idx; //return the current index
        }
        return findLastOccurrence(str, target, idx-1); //recursive call for the previous index
    }
}
