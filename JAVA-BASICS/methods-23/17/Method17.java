/*17. Write a
 Java method to count the
  number of digits in an integer with the value 2. The integer may be assumed to be non-negative.

Expected Output:

Input a number:  12541
1 */

import java.util.*;
public class Method17 {
    
    public static int pr2(int n) {
        int c = 0;
        while(n > 0) {
            int r = n % 10;
            if(r==2) c++;
            n /= 10;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int result = pr2(n);
        System.out.println(result);
    }
}
