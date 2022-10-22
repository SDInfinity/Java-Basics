package Strings;
import java.util.*;
public class replace
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        String result=" ";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='e')
            {
                result+='i';
            }
            else
            {
                result+=s.charAt(i);
            }
        }
        System.out.println("the new string is "+ result);
    }
}



// or use the function result=s.replace('e','i');