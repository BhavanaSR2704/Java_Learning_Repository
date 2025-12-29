//Syntax:-
st1;
st2;
if(condition){
  st3;
  st4;
}
else{
  st5;
  st6;
}
st7;
st8;
//==========================================
// Simple if,else ==================>
import java.util.*;
public class conditions {
    public static void main(String[] args){
        Scanner sn=new Scanner (System.in);
        int age=sn.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        }
    }
