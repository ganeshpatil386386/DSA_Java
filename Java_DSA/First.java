import java.util.Scanner;
public class  First{
    public static void main(String args[]){

        // Scanner in = new Scanner(System.in);
        // String fr = in.next();

        // switch(fr){
        //     case "mango" ->  System.out.println("Hllo");
        //     case "banana" ->  System.out.println("Basic");
        //     default -> System.out.print("Default");
            
            
                
        // }

        int num = 0;
        while(num!=5){
            System.out.println("Hello OWrld"+num);
            num++;
        }

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number");
        int a = in.nextInt();

        System.out.print("Second numer");
        int b = in.nextInt();

        int sum = a + b;
        System.out.println("The sum = "+sum);

        // int num= 0;
        // if(a>=num){
        //     System.out.println("A is large");
        // }



        
    }
}