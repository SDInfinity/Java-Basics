package Conditionalstatements;
import java.util.*;
public class ternary
{
    public static  void main(String []args)
    {
      Scanner sc=new Scanner(System.in);
      int a,b;
      int max=0;
      System.out.println("enter the value of a and b");
      a=sc.nextInt();
      b=sc.nextInt();
      max=(a>b)?a:b;
      double max2=Math.max(a,b);                           //alternate way for calculating maximum (stores in double)
      System.out.println("the maximum of a and b is "+max);
      System.out.println(max2);
    }                                                     //syntax for ternary
}                                                         //data type variable=(condition)?true expression: false expression;
//NOTE:-
//the maximum of 2 numbers can also be resolved by using the function Math.max