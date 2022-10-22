package Arrays;
import java.util.*;
public class arrayexample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int m[]=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<m.length;i++)
        {
            m[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(m[i] + " ");
        }

    }
}
