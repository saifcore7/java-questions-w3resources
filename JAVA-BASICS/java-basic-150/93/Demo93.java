/*93. Write a Java program to test if an array of integers contains an 
element 10 next to 10 or an element 20 next to 20, but not both*/

public class Demo93{
    public static void main(String[] args) {
        int[] a = {2,3,20,20,10,10,34};
        boolean b = false;
        boolean c = false;
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == a[i + 1] && (a[i] == 10 || a[i] == 20)) {
                if(a[i] == 10) b = true;
                if(a[i] == 20) c = true;
            }
        }
        if(b == true) System.out.println("True 10 and 10 present");
        else if (c == true) System.out.println("True 20 and 20 present");
        else if (b == c) System.out.println("False 20 and 20 present also 10 and 10 present");
        else System.out.println("Niether 10 , 10 nor 20 , 20");
    }
}
