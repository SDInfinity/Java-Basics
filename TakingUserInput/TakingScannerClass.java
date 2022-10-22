package TakingUserInput;
import java.util.Scanner;                                 //package for scanner class
public class TakingScannerClass
{
    public static void main(String [] args)
    {
        int time,principle;
        float rate,si;
        Scanner sc=new Scanner(System.in);          //taking scanner class
        System.out.println("enter the  time and principle");
        time= sc.nextInt();                         //assigning value of time i.e taking the value from user
        principle= sc.nextInt();
        System.out.println("enter the rate of interest ");
        rate=sc.nextFloat();
        si=(principle * time * rate)/100;           //calculating  simple interest
        System.out.println("the simple interest is "+ (double)(si));

    }
}
