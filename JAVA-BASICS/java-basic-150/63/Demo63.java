/*63. Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
Sample Output:

Input the first number : 12                                            
Input the second number: 13                                            
Result: 13
 */

public class Demo63{

    public boolean largest(int a, int b) {
        if(a==b) {
            return 0;
        }
    }
    public static void main(String[] args) {
        Demo63 obj = new Demo63();
        boolean result = obj.largest(12,13);
        System.out.println(result);
    }
}
