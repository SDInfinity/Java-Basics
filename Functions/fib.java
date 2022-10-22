package Functions;
import java.util.*;
public class fib
{
    public static void fibonacci(int n)          //wont return anything
    {
        int i,a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=0;i<=n;i++)
        {
            System.out.print(c+" ");
            c=a+b;
            a=b;                          //swapping
            b=c;
        }
        System.out.println("  ");
    }
    public static  void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        fibonacci(n);              //calling the function
    }
}
