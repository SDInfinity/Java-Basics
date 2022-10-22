package Arrays;

import java.util.Scanner;

public class transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns of the array");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = new int[m][n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("the given matrix is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("the transposed matrix is ");

        for (int i = 0; i< m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(mat[j][i] + "\t");
            }
            System.out.println(" ");
        }
    }
}
