/*74. Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10 */

import java.util.Scanner;


public class Demo74{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of array : ");
       int SIZE = sc.nextInt();
       int a[] = new int[SIZE];
       for(int i = 0; i < SIZE ; i++) {
        a[i] = sc.nextInt();
       }
       if(SIZE >= 2) {
        for(int i = 0; i < SIZE; i++) {
            if(a[0] == 10 && a[SIZE - 1] == 10) System.out.println("true");
            else System.out.println("false");

        }
       }
       else System.out.println("Size of array is not greater than or equal to 2");
       sc.close();
    }
}
