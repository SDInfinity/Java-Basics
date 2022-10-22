package Loops;

public class infiniteloops
{
    public static void main(String args[])
    {
        int i;
        for(i=0;i<10;)                      //loop with no reinitialisation
        {
            System.out.println(i);
        }
        for(;;)                            //loop with no body
        {
            System.out.println("hello world");
        }
    }
}
