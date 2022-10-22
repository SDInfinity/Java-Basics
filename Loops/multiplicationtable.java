package Loops;

public class multiplicationtable
{
    public static void main(String[]args)
    {
        for(int i=1;i<=20;i++)                      //for i being 1 we get the table of 1 till 20
        {                                           //likewise for i being 2 we get table of 2 till 20
            for(int j=1;j<=20;j++)
            {
                System.out.print(i*j + " ");

            }
            System.out.println("  ");
        }
    }
}
