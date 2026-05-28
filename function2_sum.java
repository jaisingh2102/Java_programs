// Java program to demonstrate a simple function that takes two integer inputs and returns their sum. The program defines a method called 'sum' that accepts two integer parameters 'a' and 'b', calculates their sum, and returns the result. In the main method, the program prompts the user to enter two numbers, reads the inputs using a Scanner, calls the 'sum' function with the entered numbers, and then prints the result before closing the Scanner.
import java.util.*;
public class function2_sum {
    public static int sum(int a,int b)
    {   
      return a+b;
    }
  public static void main(String[] args)
  {
Scanner sc = new Scanner(System.in);
System.out.println("enter first number");
int p = sc.nextInt();
   System.out.println("enter second number");
int q = sc.nextInt();
int result=sum(p,q);
  System.out.println("sum is "+result);
  sc.close();
  }  
}
