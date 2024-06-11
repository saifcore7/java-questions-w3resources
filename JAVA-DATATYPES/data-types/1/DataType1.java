/*1. Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius f-32 * 5/9 */
import  static java.lang.System.*;
public class DataType1{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(in);
        out.println("Input a deegree in Fahrenheit : ");
        double f = sc.nextDouble();
        out.println(f + " degree Fahrenheit is equal to " + (f-32.0) * (5.0/9.0) + " in Celcius ");
        sc.close();
    }
}