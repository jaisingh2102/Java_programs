// Java program to print a pattern of stars
import java.util.*;
public class pattern1 {
    public static void main(String[] args)
    {
        System.out.println("enter number of rows");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<n;i++)
        {
            for(int j = 1;j<=n;j++)
            {
                 System.out.print("* ");
            }
             System.out.println();
        }
        sc.close();
    }
}
