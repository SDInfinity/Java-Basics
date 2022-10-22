package Conditionalstatements;
import java.util.*;
public class switchcase
{
       public static void main(String [] args)
       {
           int day;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the day of the week");
           day=sc.nextInt();
           switch(day)                       //either it will be variable or an expression inside the switch
           {
               case 1:
                   System.out.println("I'm on leave");
                   break;                //break keyword terminates the satisfied condition of a particular block
               case 2:
                   System.out.println("I'm in office ");
                   break;
               default:
                   System.out.println("invalid input");
           }

       }
}
