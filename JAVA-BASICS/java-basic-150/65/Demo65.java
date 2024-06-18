/*65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
Sample Output:

Input the first number : 19                                            
Input the second number: 7                                             
5   
 */

public class Demo65{
    public static void main(String[] args) {
        int a = 19;
        int b = 7;
        System.out.println(a - (b * (19/7)));
    }
}
