/*82. Write a Java program to find the largest element between the first, last, and middle values in an array of integers (even length).
Sample Output:

Original Array: [20, 30, 40, 50, 67]                                   
Largest element between first, last, and middle values: 67 */

public class Demo82{
    public static void main(String[] args) {
        int[] a = {20, 30, 40, 50, 67};
        int max = a[0];
        if(max < a[a.length - 1]) max = a[a.length - 1];
        if(max < a[a.length / 2]) max = a[a.length / 2];
        System.out.println(max);

    }
}
