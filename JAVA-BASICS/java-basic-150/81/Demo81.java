/*81. Write a Java program to swap the first and last elements of an array (length must be at least 1) and create another array.
Sample Output:

Original Array: [20, 30, 40]                                           
New array after swaping the first and last elements: [40, 30, 20] */

public class Demo81{
    public static void main(String[] args) {
        int a[] = {20,30,40};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        a[0] = a[2] + a[0];
        a[2] = a[0] - a[2];
        a[0] = a[0] - a[2];
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
