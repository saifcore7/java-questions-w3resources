/*87. Write a Java program that then reads an integer and 
calculates the sum of its digits and writes the number of 
each digit of the sum in English.
*/
import java.util.*;
public class Demo87{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = {"Zero","One","Two","Three","Four",
        "Five","Six","Seven","Eight","Nine"};
        int s = 0;
        while(n>0) {
            int r = n % 10;
            s = s + r;
            n = n / 10;
        }
    }
}
