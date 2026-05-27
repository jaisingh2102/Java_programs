// This program checks whether a number entered by the user is even or odd. It prompts the user to input a number, evaluates the number using conditional statements, and then displays whether the number is even or odd.
import java.util.Scanner;
public class conditionIF {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
int number = input.nextInt();
if(number%2 == 0)
{
    System.out.println("it's a even number");
}
if(number%2 != 0)
{
    System.out.println("it's a odd number");
}
input.close();
    }
}
