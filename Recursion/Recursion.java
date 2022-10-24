package Recursion;

import java.util.*;
class binSearch
{
    int a[]={1,2,3,4,5,6,7,8,9,10};

    boolean getTarget(int start,int target,int end)
    {
        int middle = (start+end)/2;
        if(a[middle]==target)
        {
            return true;
        }
        else if(a[middle]>target)                   //target is smaller->restrict to first half of the array
        {
            return getTarget(start,target,middle-1);
        }
        else
        {
            return getTarget(middle+1,target,end);
        }
    }
    public static void main(String [] args)
    {
        binSearch s1 =new binSearch();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be searched ");
        int target=sc.nextInt();
        if(s1.getTarget(0,target,s1.a.length-1))
        {
            System.out.println("Element found ");
        }
        else
        {
            System.out.println(" Element not found ");
        }
    }
}



