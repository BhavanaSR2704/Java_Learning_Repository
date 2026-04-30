
For 0:-
Bit mask:1<<i
Operation:AND with Not

For 1:-
Bit mask:1<<i
Operation:OR


CODE:-


  
import java.util.*;
public class Bitmanipulation_Update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1;set oper=0;clear
        int n=5;//0101
        int pos=1;
        int bitmask=1<<pos;
        if(oper==1){
            //set
            int newnum=bitmask|n;
            System.out.println(newnum);
        }
        else{
            //clear
            int newBitmask=~(bitmask);
            int newnum=newBitmask & n;
            System.out.println(newnum);
        }
    }
}
