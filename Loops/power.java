package Loops;
import java.util.*;
public class power                                                                //a being multiplied b times
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter the value of a and b");
        a = sc.nextInt();
        b= sc.nextInt();
        int result=1;
        for(int i=1;i<=b;i++)                  //loop is running 'b' times
        {
            result*=a;
        }
        System.out.println(a+" to the power "+ b +" is " +result);
    }
}