// This program calculates the average of three numbers entered by the user. It prompts the user to input three numbers, computes their average, and then displays the result.
import java.util.Scanner;

public class average{
    public static void main(String[] args)
    {
       Scanner input= new Scanner(System.in);
System.out.println("enter number1 ");
double number1= input.nextDouble();
System.out.println("enter number2 ");
double number2= input.nextDouble();
System.out.println("enter number3 ");
double number3= input.nextDouble();
double avg = (number1 + number2 + number3)/3;
System.out.println("the averge of" +number1+" " +number2+"and " +number3+"is"+avg);
input.close();
    }
}