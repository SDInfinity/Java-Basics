package Conditionalstatements;
import java.util.*;
public class ifelseclass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noofpetals;
        System.out.println("enter the number of petals");
        noofpetals = sc.nextInt();
        if (noofpetals % 2 == 0) {
            System.out.println("He loves me");
        } else {                                          //syntax for ifelse
            System.out.println("He loves me not");
        }
    }
}
