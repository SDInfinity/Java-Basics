package Loops;
import java.util.*;
public class basicpatterns {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.println("enter 1 for solid rectangle");
        System.out.println("enter 2 for hollow rectangle");
        System.out.println("enter 3 for half pyramid");
        System.out.println("enter 4 for inverted half pyramid");
        System.out.println("enter 5 for inverted half pyramid rotated by 180 degrees");
        System.out.println("enter 6 for number half pyramid");
        System.out.println("enter 7 for inverted number half pyramid");
        System.out.println("enter 8 for Floyd's Triangle");
        System.out.println("enter 9 for binary half pyramid");
        System.out.println("enter 10 for  half pyramid");
        System.out.println("enter your choice ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: {
                for (i = 1; i <= 4; i++) {
                    for (j = 1; j <= 5; j++) {
                        System.out.print("*"+"  ");

                    }
                    System.out.println("  ");
                }
            }
            break;
            case 2: {
                for (i = 1; i <= 3; i++) {
                    for (j = 1; j <= 4; j++) {
                        if (i == 1 || i == 3 || j == 1 || j == 4) {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }

                    }
                    System.out.println("  ");
                }
            }
            break;
            case 3: {
                for (i = 1; i <= 4; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 4: {
                for (i = 1; i <= 4; i++) {
                    for (j = 4; j >= i; j--) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 5: {
                for (i = 1; i <= 5; i++) {
                    for (j = 5 - i; j >= 1; j--) {
                        System.out.print(" ");
                    }
                    for (j = 1; j <= i; j++) {
                        System.out.print("*");

                    }
                    System.out.println(" ");
                }
            }
            break;
            case 6: {
                for (i = 1; i <= 5; i++) {
                    for (j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 7: {
                for (i = 5; i >= 1; i--) {
                    for (j = 1; j <= i; j++) {
                        System.out.print(j);
                    }
                    System.out.println(" ");
                }
            }
            break;
            case 8: {
                int k = 1;
                for (i = 1; i <= 5; i++)
                {
                    for (j = 1; j <= i; j++)
                    {
                        System.out.print(k+" ");
                        k++;
                    }
                    System.out.println(" ");
                }

            }
            break;
            case 9:
                {
                for (i = 1; i <= 5; i++)
                {
                    for (j = 1; j <= i; j++)
                    {
                        if ((i + j) % 2 == 0) {
                            System.out.print("1" + " ");
                        } else
                            {
                            System.out.print("0" + " ");
                        }
                        System.out.println(" ");
                    }

                }
            }
            break;
            case 10: {
                for (i = 1; i <= 5; i++)
                {
                    for (j = 1; j <= i; j++)
                    {
                        System.out.print(i);
                    }
                    System.out.println(" ");
                }

            }
            break;
            default: {
                System.out.println("wrong choice");
            }
        }
    }
}



