

//Moveing all the 'x' to the end of the string
public class Recursion_12 {
    public static void main(String[] args) {
        String str="axbcxxd";
        String result=moveAllX(str, 0, 0, "");
        System.out.println(result); // Output: "abcdxxxx"
    }
public static String moveAllX(String str, int idx, int count, String newStr){
    if(idx==str.length()){ //base case: if we reach the end of the string
        StringBuilder sb=new StringBuilder(newStr);
        for(int i=0; i<count; i++){ //append 'x' count times at the end of the new string
            sb.append('x');
        }
        return sb.toString();
    }
    char curr=str.charAt(idx);
    if(curr=='x'){ //if the current character is 'x', increment the count and make a recursive call for the next index
        return moveAllX(str, idx+1, count+1, newStr);
    }else{ //if the current character is not 'x', append it to the new string and make a recursive call for the next index
        return moveAllX(str, idx+1, count, newStr+curr);
    }
  }
}
