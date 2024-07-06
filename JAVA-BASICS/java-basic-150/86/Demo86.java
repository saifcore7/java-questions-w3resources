/*86. Write a Java program starting with an integer n, 
divide it by 2 if it is even, or multiply it by 3 and add 
1 if it is odd. Repeat the process until n = 1.*/

public class Demo86{
    public static void main(String[] args) {
        int n = 6;
        while(n != 1) {
            if (n % 2 == 0) n /= 2;
            else (n * 3 + 1) /= 2;
        }
    }
}
