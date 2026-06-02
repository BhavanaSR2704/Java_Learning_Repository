
//Find the first and last occurance of an element in string

public class Recursion_10 {
    public static int first=-1;
    public static int last=-1;
    public static void findOccurance(String str, int idx,char element){
        if(idx==str.length()){
            System.out.println("First Occurance: "+first);
            System.out.println("Last Occurance: "+last);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar==element){
            if(first==-1){
                first=idx; //update first occurance
            }
            else{
                last=idx; //update last occurance
            }
        }   
            findOccurance(str, idx+1, element); //recursive call for the next index
    }    

    public static void main(String[] args) {
        String str="abaaudafaah";
        findOccurance(str, 0, 'a'); //start from the first index
        }
    }

