//String is immutable, so every modification creates a new object, 
//whereas StringBuilder is mutable and modifies the same object,
//making it more efficient for frequent string operations.



  public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);
        //Char at index 0
        System.out.println(sb.charAt(0));
        //Set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);
    }
}
