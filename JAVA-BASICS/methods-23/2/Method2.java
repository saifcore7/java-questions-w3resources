/*2. Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0
 */

import java.util.Scanner;
import static java.lang.System.*;
public class Method2 {

    public void average(int aa, int bb, int cc)
    {
      System.out.println((float)(aa+bb+cc)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Method2 obj = new Method2();
        out.println("Input the first number: ");
        int a = sc.nextInt();
        out.println("Enter the second number: ");
        int b = sc.nextInt();
        out.println("Enter the third number: ");
        int c = sc.nextInt();
        obj.average(a, b, c);
    }
}
