import java.util.*;
public class Switch {
    public static void main(String[] args){
        Scanner sn=new Scanner (System.in);
        int button =sn.nextInt();
        // if(button==1){
        //     System.out.println("Hello");
        // }
        // else if(button==2){
        //     System.out.println("Namaste");
        // }
        // else if(button==3){
        //     System.out.println("Namaskara");
        // }
        // else{
        //     System.out.println("Invalid button");
        // }
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2:System.out.println("Namaskara");
            break;
            case 3: System.out.println("Namaste");
            break;
            default :System.out.println("Invalid button");
        }

    }
}
