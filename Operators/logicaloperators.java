package Operators;

public class logicaloperators {                      //gives boolean as the return type
    public static void main(String [] args)
    {
        int a=3;
        int b=5;
        System.out.println((a>b) && (b>a));         //logical and->returns true if both the conditions are true
        System.out.println((a>b) || (a<b));         //logical or->returns true if either is true
        System.out.println(!(a>b));                 //logical not->returns true if condition is false and vice versa
    }
}
