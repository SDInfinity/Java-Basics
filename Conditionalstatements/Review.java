package Conditionalstatements;
import java.util.*;
public class Review
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int rating;
        System.out.println("enter the rating out of five ");
        rating=sc.nextInt();
        switch (rating)
        {
            case 1:                           //syntax for merging cases using switch without repetition
            case 2:                           //this indicates if rating=1 or 2 --then review is bad
                System.out.println("REVIEW:- BAD");
                break;
            case 3:
            case 4:
                System.out.println("REVIEW :-AVERAGE");
                break;
            case 5:
                System.out.println("REVIEW :-GOOD");
                break;
            default :
                System.out.println("INVALID INPUT");
        }
    }
}
