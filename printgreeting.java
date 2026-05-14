// This program takes an integer input from the user and prints a greeting based on the value of the input.
import java.util.Scanner;
public class printgreeting {
   public static void main(String[]args)
   {
    Scanner button = new Scanner(System.in);
    int a = button.nextInt();
    if(a == 1)
    {
        System.out.println("hello");
    }
    else if(a == 2)
    {
       System.out.println("namaste"); 
    }
    else
    {
        System.out.println("bonjour");
    }
    button.close(); 
   } 
}
