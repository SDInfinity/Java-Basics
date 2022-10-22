package TypeCasting;

public class type
{
    public static void main(String []args)     //Type Casting:-assigning values of one  primitive data type to another.
    {
        int x=99;
        double d=x;                             //Automatic Type Casting
        double d1=99.9;
        int x1=(int)d1;                         //From Double to Int (Manual Type Casting)
        System.out.println(d);                  //printing the double value.
        System.out.println(x1);                 //printing the  integer value.

    }
}
                                         //From smaller data type to a larger one it becomes automatic
                                         //type casting
                                         //from larger data type to smaller we have to perform
                                         //manual type casting