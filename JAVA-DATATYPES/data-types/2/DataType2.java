/*2. Write a Java program that reads a number in inches and converts it to meters.
Note: One inch is 0.0254 meter.
Test Data
Input a value for inch: 1000
Expected Output :
1000.0 inch is 25.4 meters */
import static java.lang.System.*;
public class DataType2 {

    public final static double m = 0.0254;
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(in);   
        out.println("Input a value for inch: ");
        double i =  sc.nextDouble();
        out.println(i*m); 
    }
}
