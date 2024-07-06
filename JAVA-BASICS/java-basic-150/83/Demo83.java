/*83. Write a Java program to multiply the corresponding elements of two integer arrays.
Sample Output:

Array1: [1, 3, -5, 4]                                                  
                                                                       
Array2: [1, 4, -5, -2]                                                 
                                                                       
Result: 1 12 25 -8*/

public class Demo83{
    public static void main(String[] args) {
        int[] a1 = {1, 3, -5, 4};
        int[] a2 = {1, 4, -5, -2};

        for(int i = 0; i < 4; i++) {
            int result = a1[i] * a2[i];
            System.out.print(result + " ");
        }    
    }
}
