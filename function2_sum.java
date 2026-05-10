
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
