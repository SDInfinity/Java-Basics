package DataTypes;

import java.net.StandardSocketOptions;

public class DataTypesTutorial
{
    public static  void main(String []args)
    {                                  //seven primitive data types in java are as follows :-
        int a=10;                      // 1               Integer type    (4 bytes).
        byte x1=10;                    // 2                      ""       (1 byte).
        short k=20;                    // 3                      ""       (2 bytes).
        long t=999999999;              // 4                      ""       (8 bytes).
        float f=99.0f;                 // 5               Decimal Type
        double d=99.99;                // 6                      ""
        char c='p';                    // 7               Character Type
        boolean x=true;                // 8                Boolean Type
        System.out.println(x);
        System.out.println(a);
        System.out.println(t);
        System.out.println(f);
        System.out.println(d);
        System.out.println(x1);
        System.out.println(k);
        System.out.println(c);        //NOTE:-
    }                                 //1 byte =8 bits
}                            //Most Significant bit stores the sign
                             //for example :-byte stores 2^8 numbers including the sign i.e from (-127 to +128)
