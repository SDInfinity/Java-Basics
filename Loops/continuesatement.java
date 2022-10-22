package Loops;

public class continuesatement                               //What is a Continue statement in Java?
                                                            //The Java continue statement stops one iteration in a loop and continues to the next iteration.
{                                                          //This statement lets you skip particular iterations without stopping a loop entirely.
    public static void main(String [] args)
    {
        for(int i=1;i<=20;i++)
        {
            if(i>=4 && i<=15)
                continue;                               //'skips' the current executing condition and goes over to the next condition
            System.out.println(i+ " ");
        }
    }
}
