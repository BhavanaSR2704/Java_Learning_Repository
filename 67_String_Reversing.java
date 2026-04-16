
public class String_Reversing {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello")
        for(int i=o;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;//5-1-0
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setcharAt(front,backchar);
            sb.setcharAt(back,frontchar);

        }
        System.out.println(sb);
    }
}
