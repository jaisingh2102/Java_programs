import java.util.*;
public class function4_perfectSqure {
    public static boolean isperfectsqure(int a)
    {
        int root = (int)Math.sqrt(a);
        return root*root==a;
    }
 public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int s = sc.nextInt();
if(isperfectsqure(s))
{
    System.out.println("perfect squre");
}
else
    {
   System.out.println("not aperfect squre");
}
sc.close();
 }   
}
