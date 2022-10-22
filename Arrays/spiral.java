package Arrays;
import java.util.*;
public class spiral
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows and columns of the array");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        System.out.println("enter the elements in the array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("the array is as follows");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] +"\t");
            }
            System.out.println(" ");
        }
        System.out.println("the given matrix in spiral form is as follows");

        int row_start=0;
        int rowend=m-1;
        int col_start=0;
        int colend=n-1;
        while(row_start<=rowend && col_start<=colend)
        {
            for(int col=col_start;col<=colend;col++)
            {
                System.out.print( mat[row_start][col]+ " ");
            }
            row_start++;
            for(int row=row_start;row<=rowend;row++)
            {
                System.out.print( mat[row][colend]+ " ");
            }
            colend--;

            for(int col=colend;col>=col_start;col--)
            {
                System.out.print(mat[rowend][col]+ " ");
            }
            rowend--;
            for(int row=rowend;row>=row_start;row--)
            {
                System.out.print(mat[row][col_start]);
            }
            col_start++;
        }
    }
}
