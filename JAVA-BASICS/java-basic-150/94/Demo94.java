/*94. Write a Java program to rearrange all the elements of a 
given array of integers so that all the odd numbers come 
before all the even numbers.*/

import java.util.*;
public class Demo94{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int[] even = new int[5];
        int[] odd = new int[5];
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 != 0) {
                odd[i] = a[i];
            } else {
                even[i] = a[i]; 
            }
        }
        System.out.println(Arrays.toString(even));
    }
}
