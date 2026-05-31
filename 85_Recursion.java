


//Printing a string in reverse order using recursion


public class Recursion_9 {
    public static void printReverse(String str, int index){
        if(index==0){ //base case
            System.out.print(str.charAt(index));
            return;
        }
        //recursive call: print the rest of the string in reverse order
        printReverse(str, index-1);
        //print the current character after the recursive call
        System.out.print(str.charAt(index));
    }
    public static void main(String[] args) {
        String str="Hello, World!";
        printReverse(str, str.length()-1); //start from the last index
    }   
}
