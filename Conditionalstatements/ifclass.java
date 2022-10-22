package Conditionalstatements;
import java.util.*;
public class ifclass {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("enter the age");
        age = sc.nextInt();
        if (age >= 18)                       //syntax for using conditional if
        {
            System.out.println("You can vote ");
        }

    }
}                                 // NOTE:-
//                                 if the condition is not met then the output will be a blank statement
//                                 never use ";" at the end of the statement or else it becomes an empty statement