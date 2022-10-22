package Strings;
import java.util.*;
public class length
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String names[];
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        names =new String[size];
        System.out.println("enter the elements of the array");
        for(int i=0;i<size;i++)
        {
            names[i] = sc.next();
        }

        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=names[i].length();                        //adds lengths of each string
        }

          System.out.println("the combined length of all the strings in the array is "+ sum);
    }
}
