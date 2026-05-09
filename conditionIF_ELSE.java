// 3. Write a program to find the greatest of two numbers.
import java.util.Scanner;

public class conditionIF_ELSE {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        if(number1 > number2)
        {
         System.out.println("number1 is the greatest number");   
        }
        else
        {
         System.out.println("number2 is the greatest number");   
        } input.close();
    }
}
