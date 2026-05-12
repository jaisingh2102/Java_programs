// Java program to print a pattern of stars
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args)
    { 
        System.out.println("enter number of rows");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i,j;
        for(i = 1;i<=n;i++)
        {
            for(j = 1;j<=i;j++)
        {
                            System.out.print("* "); 
            
        }
         System.out.println();
        sc.close();
    }
}
}
