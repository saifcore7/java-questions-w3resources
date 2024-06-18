/*66. Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output:

Sum of the first 100 prime numbers: 24133  */

public class Demo66{
    public static void main(String[] args) {
        int s = 0;
        for(int i = 2; i <=100; i++) {
            if (i % 1 == 0 && i % i == 0) s = s + i;
        }
        System.out.println(s);
    }
}
