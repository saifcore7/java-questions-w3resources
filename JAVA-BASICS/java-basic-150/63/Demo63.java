/*63. Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
Sample Output:

Input the first number : 12                                            
Input the second number: 13                                            
Result: 13
 */

public class Demo63{

    public int largest(int a, int b) {
        if (a == b) return 0;
        else if (a % 6 == b % 6) return (a>b?b:a);
        return a>b?a:b; 
        

    }
    public static void main(String[] args) {
        Demo63 obj = new Demo63();
        int result = obj.largest(15,15);
        System.out.println(result);
    }
}
