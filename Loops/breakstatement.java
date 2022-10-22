package Loops;
import java.util.*;
public class breakstatement
{                                                                       //When a break statement is encountered inside a loop, the loop is immediately terminated
    public static  void main(String [] args)                             //and the program control resumes at the next statement following the loop
    {
        for(;;)                                                     //it will go on until a negative number is taken as an input
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n");
            int n=sc.nextInt();
            if(n<0)
                break;                                            // here "break" keyword terminates the loop
        }                                                         //whenever the user takes a negative input
    }
}
