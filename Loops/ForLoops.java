package Loops;
import java.util.*;
public class ForLoops
{
    public static  void main(String [] args)
    {                                                             //syntax
                                                                  //for(initialisation;condition;re-initialisation)
        Scanner sc=new Scanner(System.in);
        int choice,i;
        System.out.println("enter 1 for displaying numbers from 1 to 10 ");
        System.out.println("enter 2 for displaying even numbers from 1 to 10 ");
        System.out.println("enter 3 for displaying sum of numbers from 1 to 10 ");
        System.out.println("enter 4 for displaying sum of even numbers from 1 to 10 ");
        System.out.println("enter 5 for displaying table of any number  till ten ");
        System.out.println("enter 6 for displaying factorial till 10 ");
        System.out.println("  ");
        System.out.println("enter your choice ");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                for (i = 1; i <= 10; i++)
                {
                    System.out.print(i+" ");
                }
                break;
            case 2:
                for (i = 2; i <= 10; i = i + 2)
                {
                    System.out.print(i +" ");
                }
                break;
            case 3:
                int sum = 0;
                for (i = 1; i <= 10; i++)
                {
                    sum = sum + i;
                }
                System.out.println("the sum of numbers till 10 is "+sum);
                break;
            case 4:
                int s = 0;
                for (i = 2; i <= 10; i = i + 2)
                {
                    s += i;                                       //shorthand expression
                }
                System.out.println("the sum of even number till 10 is "+s);
                break;
            case 5:
                Scanner cs = new Scanner(System.in);
                System.out.println("enter the number whose table you want ");
                int n = cs.nextInt();
                System.out.println("the table is ");
                for (i = 1; i <= 10;i++)
                {
                    System.out.println(n + "*" + i + "=" + (n*i));
                }
                System.out.println(" ");
                break; 
            case 6:
                int p = 1;
                System.out.println("the factorial is");
                for (i = 1; i <=10; i++)
                {
                    p = p * i;
                    System.out.print(i + "*");
                }
                System.out.println("=" + p);                //displays the final value of factorial
                break;
            default:
                System.out.println("INVALID INPUT");
        }
    }
}
