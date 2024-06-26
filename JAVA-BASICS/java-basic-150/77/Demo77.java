/*77. Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]                                                   
Array2: [5, -50, 10]                                                   
New Array: [50, 10] */

public class Demo77 {
    public static void main(String[] args) {
        int[] a1 = { 50, -20, 0 };
        int[] a2 = { 5, -50, 10 };
        int[] a3 = new int[2];
        for (int i = 0; i < 2; i++) {
            if (i == 0)
                a3[i] = a1[i];
            else 
                a3[i] = a2[a2.length - 1];
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(a3[i] + " ");
        }
        System.out.println();
    }
}
