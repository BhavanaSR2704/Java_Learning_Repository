
public class String_Builder {
    public static void main(String[] args) {
         StringBuilder sb=new StringBuilder("Tony");
         System.out.println(sb);
         sb.insert(2,'n');
         System.out.println(sb);
         sb.delete(2, 4);
         System.out.println(sb);
    }
}
