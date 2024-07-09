/*93. Write a Java program to test if an array of integers contains an 
element 10 next to 10 or an element 20 next to 20, but not both*/

public class Demo93{
    public static void main(String[] args) {
        int[] a = {2,3,10,1,34};
        for(int i = 0; i < a.length; i++) {
            if(a[i] == a[i + 1]) {
                System.out.println("True");
                break;
            }
        }
    }
}
