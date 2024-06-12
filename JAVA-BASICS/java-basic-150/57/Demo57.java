/*
 57. Write a Java program to accept an integer and count the factors of the number.
Sample Output:

Input an integer: 25                                                   
3

 */

public class Demo57 {
    public static void main(String[] args) {
        int n = 30, factors = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                factors++;
            }
        }
        System.out.println(factors);
    }
}
