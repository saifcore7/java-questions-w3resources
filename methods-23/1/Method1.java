/*
 1. Write a Java method to find the smallest number among three numbers.
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
 */

public class Method1 {

    void smallestNumber(int a, int b, int c) {
        System.out.println(a < b && a < c ? "A is smallest: " + (float)a
                : b < a && b < c ? "b is smallest : " + (float)b : "C is smallest : " + (float)c);
    }

    public static void main(String[] args) {

        Method1 obj = new Method1();
        obj.smallestNumber(2,3,4);
    }
}
