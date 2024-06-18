/*66. Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:

Sum of the first 100 prime numbers: 24133  */

public class Demo66{
    public static void main(String[] args) {
        int count;
        int s = 0;
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < i; j++) {
                count = 0;
                if (i%j==0) {
                    count++;
                }
            }
            if( count == 2) {
                System.out.println(i);
            }
        }
        
    }
}
