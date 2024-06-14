/*19. Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101  */


public class Demo19{
    public static void main(String[] args) {
        int a[] = new int[100], i = 0;
        int n = 5;
        while (n!=0) {
            a[i++]= n % 2;
            n = n / 2;
        }
        for(int j = i - 1; j >= 0; j--) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
        
    }
}
