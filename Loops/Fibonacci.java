package Loops;
import java.util.*;
public class Fibonacci                                    //series which gives the sum of 2 numbers as the next number
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the value of n");
        n=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
