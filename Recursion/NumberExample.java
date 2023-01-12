package Recursion;
import java.util.*;

public class NumberExample {
    public static void main(String[] args) {
        //printing the number from 1 to n using recusion 

        //calling the function 
        printNumber(1);

    }

static void printNumber(int n ){

    //this is the base condition
        if(n > 5){
            return ;
        }
        System.out.print(n+" ");
        printNumber(n+1);
    }
}
