// This program calculates the area of a circle using a constant value for PI. It prompts the user to enter the radius of the circle, computes the area using the formula A = πr^2, and then displays the result.
import java.util.Scanner;
public class ComputeAreaWithConstant {
    public static void main(String[] args)
    {
        final double PI = 3.1415;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius");
        double radius = input.nextDouble();
        double area = (radius*radius*PI);
         System.out.println("THE AREA OF RADIUS "+radius+"is"+area);
         input.close();
    }
}
