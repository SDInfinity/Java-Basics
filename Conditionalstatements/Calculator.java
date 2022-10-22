package Conditionalstatements;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=0;                            //garbage value stored in "result"
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the operation");
        sc.nextLine();                       //*this is important in this program when 2 integers are  already assigned before
        String operation = sc.nextLine();
        switch (operation) {
            case "+":
                result = a + b;
                break;
            case "-":
                if(a>b) {
                    result = a - b;
                }
                else {
                    result = b - a;
                }
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:                                            //no break for default as it is the terminating case
                System.out.println("INVALID");
        }
        System.out.println("the result is " + result);
    }
}




