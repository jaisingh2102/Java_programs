// This program takes two integer inputs from the user, calculates their sum, and prints the result.
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.println("enter the value of a\n");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        System.out.println("enter the value of b\n");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();
        int sum = num1 +num2;
       System.out.println("the sum of number a"+num1+"and number b" +num2+"is"+sum);
       a.close(); 
       b.close(); 
    }
}
