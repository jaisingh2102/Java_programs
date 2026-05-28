// Java program to determine if a given number is even or odd. The program defines a method called 'even_odd' that takes an integer input and checks if it is even or odd by using the modulus operator. In the main method, the program prompts the user to enter a number, reads the input using a Scanner, and then calls the 'even_odd' function to determine and print whether the number is even or odd before closing the Scanner.
import java.util.*;
public class function3_evenOdd
{
    public static void even_odd(int a)
    {
return ;
    }
    public static void main(String[] args)
    {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int p = sc.nextInt();
if(p%2==0)
    {
System.out.println("even  number");
    }
    else
        System.out.println("odd  number");
    even_odd(p);
sc.close();
    }
}