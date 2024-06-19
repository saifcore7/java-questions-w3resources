/*78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:

Original Array: [5, 7]                                                 
true  */

public class Demo78{
    public static void main(String[] args) {
        int[] a = {5,7};
        System.out.println(a[0] == 7 || a[1] == 7);
    }
}
