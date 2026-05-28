// Java program for Fibonacci number using recursion. The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1. This program defines a recursive method to calculate the Fibonacci number for a given position in the sequence and then prints the first 10 Fibonacci numbers.
class fibonacci
{
    static int fib(int n)
    {
        if(n <= 1)
        {
            return n;
        }
        else
        return fib(n-1) + fib(n-2);
    }
public static void main(String[] args)
{
    int n=10;
    for(int i=0;i<n;i++)
    {
        System.out.println(fib(i) +" ");
    }
}
}
