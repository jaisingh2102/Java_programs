//This program calculates the area of a circle given its radius.
import java.util.Scanner;
public class Area{
    public static void main(String[] args)
    {
Scanner input= new Scanner(System.in);
System.out.println("enter number for radious");
double radius = input.nextDouble();
double Area = radius * radius * Math.PI;
System.out.println("area of" +radius+ "is "+Area);
input.close();
    }
}