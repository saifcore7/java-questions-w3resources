/*69. Write a Java program to extract the first half of a even string.
Test Data: Python
Sample Output:
Pyt */

public class Demo69{
    public static void main(String[] args) {
        String str = "Python";
        System.out.println(str.substring(0, str.length() / 2));
    }
}
