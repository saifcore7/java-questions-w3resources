/*64. Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.
Sample Output:

Input the first number : 35                                            
Input the second number: 45                                            
Result: true */

public class Demo64{
    public boolean common(int a, int b) {
        while(a!=0 && b !=0) {
            int r1 = a % 10;
            int r2 = b % 10;
            a = a / 10;
            b = b / 10;
            if(r1==r2) 
                return true;
            
        }
        return false;
    }
    public static void main(String[] args) {
        Demo64 obj = new Demo64(); 
        boolean result = obj.common(25, 75);
        System.out.println(result);
    }
}
