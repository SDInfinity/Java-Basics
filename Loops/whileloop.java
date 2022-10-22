package Loops;
import java.util.*;
public class whileloop {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int s=0;
        int i=1;
        while (i<=n)
        {
            s=s+i;
            i++;
        }
        System.out.print("Sum"+ " " +s);
    }
}
