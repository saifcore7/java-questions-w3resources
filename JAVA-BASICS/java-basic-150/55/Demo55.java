/*55. Write a Java program to convert seconds to hours, minutes and seconds.
Sample Output:

Input seconds: 86399                                                   
23:59:59
 */

public class Demo55{
    public static void main(String[] args) {
        int s = 86399;
        int m = 86399 / 60;
        int m1 = s % 60;
        int h = m / 60;
        int h1 = m % 60;
        System.out.println(h + " " + h1 + " " + m1);
    }
}
