/*80. Write a Java program to get the largest value between the first and last elements of an array (length 3) of integers.
Sample Output:

Original Array: [20, 30, 40]                                           
Larger value between first and last element: 40 */

public class Demo80{
    public static void main(String[] args) {
        int a[] = {20,30,40};
        if(a[0] > a[2]) System.out.println("Larger value is" + a[0]);
        else System.out.println("Larger value is" + a[2]);
    }
}
