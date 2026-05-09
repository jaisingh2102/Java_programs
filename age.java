// 2. Write a program to check whether a person is an adult or not.
import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        System.out.println("enter the age of a preson\n");
        Scanner age = new Scanner(System.in);
        int a = age.nextInt();
        if(a >= 18)
        {
          System.out.println("the person is adult\n");    
        }
        else{
              System.out.println("the person is not adult\n");
        }
        age.close();
    }
}
