// this program is to print the table of given number
import java.util.Scanner;
public class table {
    public static void main(String [] args)
    {
        System.out.println("give the input");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println("the table of given number is");
        for(int i=1;i<=10;i++)
        {
           System.out.println(i*n); 
          }
          sc.close();
    }
}
