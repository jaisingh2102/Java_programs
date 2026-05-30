// This code defines a class named 'printgreeting' that prompts the user to enter an integer. Based on the input, it prints a greeting message in different languages. If the user enters 1, it prints "hello". If the user enters 2, it prints "namaste". For any other input, it prints "bonjour". The program uses a Scanner to read user input and closes the scanner at the end to prevent resource leaks.
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
