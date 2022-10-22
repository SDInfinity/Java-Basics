package Conditionalstatements;

import java.util.Scanner;

public class nestedifusingternary
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter the value of a b and c");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int max=0;
        max=(a>b)?(a>c)?a:c:(b>c)?b:c;                        //ternary statement
        System.out.println("the greatest of three numbers is "+max);
    }
}


                                         //syntax for ternary
                                         //(expression)?result:other result;