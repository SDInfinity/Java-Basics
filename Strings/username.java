package Strings;
import java.util.*;
public class username
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the mail ");
        String mail=sc.next();
        String username=" ";
        char c;
        for(int i=0;i<=mail.length();i++)
        {
            if(mail.charAt(i)=='@')
            {
             break;
            }
            else
            {
                username+=mail.charAt(i);             //continue with the rest of the string
            }
        }
        System.out.println("the username is "+ username);

    }
}
