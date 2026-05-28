// Java program to demonstrate a simple function that takes a string input and prints it. The program defines a method called MyName that accepts a string parameter 'name' and prints it to the console. In the main method, the program prompts the user to enter their name, reads the input using a Scanner, and then calls the MyName function with the entered name before closing the Scanner.
import java.util.*;
public class function_MyName {
    public static void MyName(String name)
    {
        System.out.println(name);
        return ;
    }
    public static void main(String[] args)
    {
     Scanner sc = new   Scanner(System.in);
     String name = sc.next();
     MyName(name);
     sc.close();
    }
}
