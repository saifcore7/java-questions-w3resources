/*79. Write a Java program to rotate an array (length 3) of integers in the left direction.
Sample Output:

Original Array: [20, 30, 40]                                           
Rotated Array: [30, 40, 20] */

import java.util.Scanner;

public class Demo79{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i <= 3; i++) {
            a[i - 1] = a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
