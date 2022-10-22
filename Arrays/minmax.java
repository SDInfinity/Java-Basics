package Arrays;
import java.util.*;

    public class minmax
    {
    public static void main(String args[])
    {
        System.out.println("enter tye size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        System.out.println("enter the elements of the array");
        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max =numbers[0];
        int min =numbers[0];

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);

    }
}

