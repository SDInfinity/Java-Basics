package Conditionalstatements;
import java.util.*;
public class nestedif
{
    public  static void main(String [] args)
 {
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter the value of a b and c");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    int max=0;
    if(a>b)
    {
        if(a>c)                              //if within another if -> nested if
        {
            max=a;
        }
        else
        {
            max=c;                           //since if 'c' is greater than 'a' it is already greater than 'b'
        }
    }
    else
    {
        if(b>c)                                    //we have already established the case for 'a'
        {
            max=b;
        }
        else
        {
            max=c;
        }
    }
    System.out.println("the greatest of three numbers is "+max);
 }
 }
