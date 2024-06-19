/*76. Write a Java program to test if the first and last element of two integer arrays are the same. The array length must be greater than or equal to 2.
Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
array2 = 45, 20, 10, 20, 30, 50, 11
Sample Output:

false */


public class Demo76{
    public static void main(String[] args) {
       int[] a1 = {1,2,3,4,5};
       int[] a2 = {1,3,4,5,5};
       System.out.println(((a1[0] == a2[0]) || (a1[a1.length -1] == a2[a2.length - 1]))?"true":"false");

    }
}
