/* 52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is: true*/

public class Demo52 {

    public boolean sum(int a, int b, int c) {
        return a + b == c;
    }

    public static void main(String[] args) {
        Demo52 obj = new Demo52();
        System.out.println(obj.sum(4, 4, 8));
    }
}
