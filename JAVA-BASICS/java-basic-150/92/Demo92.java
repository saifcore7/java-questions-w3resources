/*92. Write a Java program to count the number 
of even and odd elements in a given array of integers.
Click me to see the solution*/

public class Demo92{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int even = 0,odd = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) even++;
            else odd++;
        }
    }
}
