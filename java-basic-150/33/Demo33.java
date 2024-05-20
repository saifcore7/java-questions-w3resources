/*33. Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output */
public class Demo33{
    public static void main(String[] args) {
        int n = 25;
        int s = 0;
        while(n>0)
        {
            s+=(n%10);
            n/=10;
        }
        System.out.println(s);
    }
}
