/*3. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

Test Data
Input an integer between 0 and 1000: 565
Expected Output :
The sum of all digits in 565 is 16 */
import java.util.*;
import static java.lang.System.*;
public class DataType3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Input a integer bertween 0 and 1000");
        int a = sc.nextInt(), s = 0;
        while(a!=0)
        {
            s += (a % 10);
            a /= 10;
        }
        out.println(s);
    }
}
