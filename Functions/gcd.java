package Functions;
import java.util.*;
class gcd
{
    public static int calculategcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return b;

    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The gcd is "+calculategcd(a,b));

    }
}

