/*66. Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:

Sum of the first 100 prime numbers: 24133  */

public class Demo66{
    public static void main(String[] args) {
        int s = 2;
        for(int i = 3; i <=100; i++) {
            for(int j = 2; j<=i-1; j++) {
                if ( i % j != 0) s = s + i;
            }
        }
        System.out.println(s);
    }
}
