package Operators;

public class bitwiseoperators
{
    public static  void main(String [] args)
    {
        int a=13;
        int b=10;
        int c=a & b;
        System.out.println("on performing 'and' operation we get "+c);
        int d=a | b;
        System.out.println("on performing 'or' operation we get "+d );
        int f=a>>1;
        System.out.println("on performing 'right shift' we get "+f);
        int g=b<<1;
        System.out.println("on performing 'left shift' we get "+g);
    }
}
//the bitwise operators deal with binary numbers.

//and operator(x)-example: 13 in binary is 1101 and 10 in binary is 1010
//so on performing and we get 8 which is 1000 in binary           1101          1x0=0
//                                                                1010          1x1=1
//   result:-                                                     1000          0x0=0


//similarly for or operator(+)                                    1101           1+1=1
//                                                                1010           1+0=1
//   result:-                                                     1111           0+0=0


//right shift(>>) divides the number by 2         ex:-13/2=6(quotient) 6 in binary  is  0110
//left  shift(<<)multiplies the number by 2       ex:-13*2=26(product) 26 in binary is  11010