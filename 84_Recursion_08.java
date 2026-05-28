
//Solving the Tower of Hanoi problem using recursion

public class Recursion_08 {
    public static void towerOfHanoi(int n, char source, char helper, char destination){
        if(n==1){ //base case
            System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
            return;
        }
        //recursive call 1: transfer n-1 disks from source to helper using destination as helper
        towerOfHanoi(n-1, source, destination, helper);
        //transfer the nth disk from source to destination
        System.out.println("Transfer disk "+n+" from "+source+" to "+destination);
        //recursive call 2: transfer n-1 disks from helper to destination using source as helper
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n=3; //number of disks
        towerOfHanoi(n, 'A', 'B', 'C'); //A is source, B is helper, C is destination
    }
}


