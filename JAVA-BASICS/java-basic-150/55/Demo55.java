/*55. Write a Java program to convert seconds to hours, minutes and seconds.
Sample Output:

Input seconds: 86399                                                   
23:59:59
 */

public class Demo55{
    public static void main(String[] args) {
        System.out.println(86399 / 3600 + ":" + (86399 / 60) % 60 + ":" + 86399 % 60);
    }
}
