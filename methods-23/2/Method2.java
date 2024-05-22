
/*2. Write a Java method to compute the average of three numbers.
Test Data:
Input the first number: 25
Input the second number: 45
Input the third number: 65
Expected Output:

The average value is 45.0 */

public class Method2 {
    void avgNum(float a, float b, float c) {
        System.out.println((a+b+c)/3);
    }

    public static void main(String[] args) {
        Method2 obj = new Method2();
        obj.avgNum(25, 45, 65);
    }
}
