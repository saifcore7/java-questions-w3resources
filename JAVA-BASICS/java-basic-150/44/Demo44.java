/*
44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5                                                        
5 + 55  + 555

 */

public class Demo44 {
    public static void main(String[] args) {
        int n = 5, a = 0, p = 3, s = 0;
        while (p != 0) {
            s = (n + s * 10);
            System.out.print(s);
            if (p != 1)
                System.out.print("+");
            a = a + s;
            p--;
        }
        System.out.println("\n" + a);
    }
}
