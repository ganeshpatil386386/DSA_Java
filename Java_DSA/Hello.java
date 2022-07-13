import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String nin = input.next(); 
        String msg = hello(nin);
        System.out.println(msg);
        
    }

    static String hello(String name){

        String reply = "Hello \n" + name;
        return reply;
    }
}
