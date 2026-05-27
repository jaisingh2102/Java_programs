// This program checks whether a number entered by the user is even or odd. It prompts the user to input a number, evaluates the number using conditional statements, and then displays whether the number is even or odd.
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args)
    {
System.out.println("enter a number\n");
Scanner number = new Scanner(System.in);
int a = number.nextInt();
if(a%2==0)
{
 System.out.println("even number\n");   
}
else{
    System.out.println("odd number\n");
}
number.close();
    }
}
