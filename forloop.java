// Java program to demonstrate the use of a for loop. The program prompts the user to enter a number and then uses a for loop to print the values of 'i' from 0 to that number, inclusive. Each value of 'i' is printed on a new line, showing the progression of the loop as it iterates through the specified range.
import java.util.Scanner;
public class forloop {
    public static void main(String[] args)
    {
System.out.println("enter a number");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i;
for(i=0; i<=n; i++)
{
  System.out.println("the value of i is = "+i);  
}
sc.close();
    }
    
}
