/*75. Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false */

import java.util.Scanner;
import static java.lang.System.*;
public class Demo75{

    void same(int SIZE) {
        Scanner sc = new Scanner(in);
        int a[] = new int[SIZE];
        if(SIZE >= 2) {
            for(int i = 0; i < SIZE; i++) {
                a[i] = sc.nextInt();
            }
            if(a[0] == a[SIZE -1]) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("Size is less than 2");
        }
        sc.close();
    }
    public static void main(String[] args) {
        Demo75 obj = new Demo75();
        Scanner sc = new Scanner(in);
        out.println("Enter the size of array : ");
        int s = sc.nextInt();
        obj.same(s);
        sc.close();
    }
}
