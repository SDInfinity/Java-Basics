package Arrays;
import java.util.*;
public class linsearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY");
        int size=sc.nextInt();
        String m[]=new String[size];
        System.out.println("enter the elements in the array");
        for(int i=0;i<size;i++)
        {
            m[i]=sc.next();
        }
        System.out.println("enter the hashtag to be searched");
        String l=sc.next();
        for(int i=0;i<size;i++)
        {
            if(l.equalsIgnoreCase(m[i]))
            {
                System.out.println(m[i]+" found at "+ i);
            }
        }

    }

}
