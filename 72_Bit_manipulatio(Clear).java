
Bit mask:1<<i
Operation:AND with Not


Code:-

  public class Bitmanipulation_clear{
    public static void main(String[] args) {
        int n=5;//0101
        int pos=2;
        int bitmask=1<<pos;
        int notBitmask=~(Bitmask);
        int newnumber= notBitmask&n;
        System.out.println(newnumber);
    }
}

