/*66. Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:

Sum of the first 100 prime numbers: 24133  */

public class Demo66{
    public static void main(String[] args) {
        int count = 0;
        int s = 0;
        for(int i = 3; i < 4; i++) {
            for(int j = 1; j <= i; j++) {
                if (i%j==0) {
                    count++;
                }
            }
        }
        
    }
}
