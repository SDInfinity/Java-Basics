package Operators;

public class arithmeticoperators
{
    public static  void  main(String [] args)
    {                                     //The arithmetic operators in java are as follows :-
        int a=9;
        int b=10;
        int c=0;
        c=a+b;                              //"+"-sum
        int h=b-a;                          //"-"-difference
        int d=b/a;                          //"/"-quotient
        int e=b%a;                          //"%"-remainder(modulo)
        int f=1;
        f=a*b;                              //"*"-product

        double w=b/a;                       //gives the integer value
        double x=(double)b / (double)a;     //gives the original decimal value (explicit type casting)
        int v=++a;                          //"++"-increment operator -increase the value of the number by one
        System.out.println("the incremented value is "+v);
        int y=--a;                          //"--"-decrement operator-decreases the value of the number by one


        System.out.println("the decremented value is "+y);
        System.out.println("sum is "+c);
        System.out.println("difference is "+h);
        System.out.println("quotient is "+d);
        System.out.println("remainder is "+e);
        System.out.println("product is "+f);
        System.out.println("the double is "+w);
        System.out.println("the original value is "+x);
    }
}
