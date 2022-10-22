package Loops;

import java.util.Scanner;

public class seriessum
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n");
        n = sc.nextInt();
        float result = 0;
        for (float i = 1; i <= n; i++) {
            result += (1 / i);
            System.out.print("1/"+i+" + ");
        }
        System.out.println(" ");
        System.out.println("the sum is " + result);
    }
}
