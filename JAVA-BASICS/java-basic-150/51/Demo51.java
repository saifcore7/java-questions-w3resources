/*51. Write a Java program to convert a string to an integer.
Sample Output:

Input a number(string): 25                                             
The integer value is: 25 */

import java.util.Scanner;
public class Demo51{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(string) : ");
        String str = sc.nextLine();
        System.out.println(Integer.parseInt(str));
        sc.close();
    }
}
