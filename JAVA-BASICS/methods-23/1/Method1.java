/*1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0*/
import java.util.Scanner;
import static java.lang.System.*;
public class Method1{


    public void smallestNumber(int a1, int b1, int c1)
    {
       System.out.println((a1<b1&&a1<c1)?"a is smallest":(b1<c1&&b1<a1)?"b is smallest":"c is smallest");
    }
    public static void main(String[] args) {
        Method1 obj = new Method1();
        Scanner sc = new Scanner(in);
        out.println("Input the first number: ");
        int a = sc.nextInt();
        out.println("Enter the second number: ");
        int b = sc.nextInt();
        out.println("Enter the third number: ");
        int c = sc.nextInt();
        obj.smallestNumber(a, b, c);
    }
}