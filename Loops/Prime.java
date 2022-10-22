package Loops;                                    //*important program
import java.util.*;
import java.util.Scanner;

public class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n");
        n = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i * i <= n; i++)                           //this reduces the overall runtime of the program .
                                                                   //a numbers always has its factors from 1 to its square root.
        {
            if (n % i == 0) {
                isprime = false;                                   //checking whether the number has factors except 1 and itself.
                break;
            }
        }
        if (n < 2)                                                  //boundary condition for  0 or 1.
        {
            isprime = false;
        }
        if (isprime == true)
            System.out.println("Prime number");
        else
            System.out.println("Not prime");
    }
}
