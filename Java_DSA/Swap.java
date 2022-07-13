import java.util.*;

public class Swap {
    public static void main(String[] args) {
        
        // swap two numbers using temp
        int a= 10;
        int b = 20;

        int temp = a; // a=10 temp 10 
        a=b; // a= 20 
        b=temp; // b=10 

        System.out.println(a);
        System.out.println(b);
        System.out.println(temp);
        // swap two numbers without using temp
        int x=10 , y=15;

        x= x + y ; // x= 25
        y= x - y;  // y = 25 - 15 = 10 
        x= x - y;  // x = 25 - 10 = 15 

        System.out.println(x);
        System.out.println(y);
        
    }
}
