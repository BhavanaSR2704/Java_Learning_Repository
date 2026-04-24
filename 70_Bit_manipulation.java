1.Get bit operation
2.Set bit operation
3.Clear bit operation
4.Update bit operation





1.Get bit operation
  Bit mask:1<<i(i=position)
  Operation :AND

  Code:
      import java.util.*;
public class Bitmanipulation1 {
        public static void main(String[] args) {
        int n=5;
        int ops=2;
        int bitmask=1<<pos;
    if((bitmask & n)==0);
        System.out.println("Bit is zero");
    }
    else{
        System.out.println("Bit is one");
    }
}


