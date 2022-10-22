package Conditionalstatements;
import java.util.*;
public class elseifclass
{
    public static void main(String [] args)                       //here we use a number of conditions to get to one result
    {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("enter the number");
        a=sc.nextInt();
        if(a<=10)
        {                                                          //the compiler checks each block and if the condition gets satisfied
            System.out.println("number is less than 10");          //then the code gets executed then and there(that line)
        }
        else if (a>10 && a<=20)
        {
            System.out.println("number is greater than 10 but less than 20");
        }
        else if(a>20 && a<30)
        {
            System.out.println("number is greater than 20 but less than 30");
        }
        else
        {
            System.out.println("number is greater than 30");
        }
    }
}
