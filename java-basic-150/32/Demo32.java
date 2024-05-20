/*32. Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39 */
import java.util.*;
public class Demo32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(25 != 39);
        System.out.println(25 < 39);
        System.out.println(25 <= 39);
        sc.close();
    }
}
