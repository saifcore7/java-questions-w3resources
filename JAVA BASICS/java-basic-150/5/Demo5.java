/*
 5. Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.*;
public class Demo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.printf("%d x %d = %d\n",a,b,a*b);
        sc.close();
    }
}
