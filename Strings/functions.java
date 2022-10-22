package Strings;
import java.util.*;
public class functions {
    public static void main(String args[]) {
        String s1 = "elephant";
        String s2 = "rabbit";
        int num=123;
        char c;
        //these are some predefined functions used to perform various operations in strings

        String s3 = " ";
        s3 =s1+ " " +s2;                   //joins the 2 strings with a space
        int l=s1.length();                 //gives the length of a particular string ( counting starts from 1)
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);                         //stores the character at a given index of a string
            System.out.print(c +" ");
        }
         System.out.println(" ");
        if(s1.compareTo(s2)==0)            //compares 2 given strings ,returns 0 is strings are equal
                                           //returns negative if s2>s1 and positive if s1>s2
        {
            System.out.println("Strings are equal");
        }
        else
            {
                System.out.println("Strings are equal");
        }
        System.out.println(s1.substring(1,3));           //substring extracts the given string from the first given
                                                         //index to next given index
        String s=" ";
        s=Integer.toString(num);                        //converts the given integer to string
        int n=0;
        n=Integer.parseInt(s);                         //converts given string to integer
        System.out.println(n);
        System.out.println(s);

        String replaced=s1.replace('e','i');   //replace the given character in a string with the desired string
        System.out.println(replaced);
    }
}
