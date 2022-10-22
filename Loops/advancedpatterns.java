package Loops;
import java.util.*;
public class advancedpatterns {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("enter 1 for butterfly");
        System.out.println("enter 2 solid rhombus");
        System.out.println("enter 3 for hollow rhombus");
        System.out.println("enter 4 for number pyramid");
        System.out.println("enter 5 for palindromic pyramid");
        System.out.println("enter 6 for diamond pattern");
        System.out.println("enter your choice ");
        ch = sc.nextInt();
        switch (ch) {
            case 1: {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j <= 2 * (5 - i); j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                for (int i = 5; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    for (int j = 1; j <= 2 * (5 - i); j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 2:
            {
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=5-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=5;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 3:
            {
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=5-i;j++)      
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=5;j++)
                    {
                        if(i==1 || j== 1 || i==5 || j==5)
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 4:
            {
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=5-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(i+ " ");
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 5:
            {
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=5-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=i;j>=1;j--)
                    {
                        System.out.print(j+" ");
                    }
                    for(int j=2;j<=i;j++)
                    {
                        System.out.print(j+" ");
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 6:
            {
                for(int i =1;i<=5;i++)
                {
                    for(int j=1 ;j<=5-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*(i-1);j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }
                for(int i =5;i>=1;i--)
                {
                    for(int j=1 ;j<=5-i;j++)
                    {
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*(i-1);j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println(" ");

                }
            }

        }
    }
}



