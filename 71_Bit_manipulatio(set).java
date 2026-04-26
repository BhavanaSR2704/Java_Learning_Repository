
Bit mask:1<<i
Operation:OR

Code:-

  public class Bitmanipulation_set {
    public static void main(String[] args) {
        int n=5;//0101
        int pos=1;
        int bitmask=1<<pos;
        int newnumber=bitmask|n;
        System.out.println(newnumber);
    }
}
