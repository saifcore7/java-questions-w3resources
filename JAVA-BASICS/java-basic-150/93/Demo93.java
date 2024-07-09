/*93. Write a Java program to test if an array of integers contains an 
element 10 next to 10 or an element 20 next to 20, but not both*/

public class Demo93{
    public static void main(String[] args) {
        int[] a = {2,3,20,20,10,10,34};
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == a[i + 1] && (a[i] == 10 || a[i] == 20) && 
                (a[i + 1] == 10 && a[i + 1] == 20) && a[i] == 10 && a[i] == 20) 
                System.out.println("True");
        }
    }
}
