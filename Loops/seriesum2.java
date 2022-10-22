package Loops;

import java.util.Scanner;

public class seriesum2
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the value of n");
        n = sc.nextInt();
        float result = 0;
        for (float i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                result -= (1 / i);
            } else

                {
                result += (1 / i);
            }
        }
        System.out.println(result);
    }
}
