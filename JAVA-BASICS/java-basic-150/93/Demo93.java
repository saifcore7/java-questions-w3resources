/*93. Write a Java program to test if an array of integers contains an 
element 10 next to 10 or an element 20 next to 20, but not both*/

import java.util.*;
public class Demo93 {
    public static void main(String[] args) {
        // Define an array of integers
        int[] nums = {10, 10, 2, 4, 20};
        
        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(nums));

        // Initialize boolean variables to check for specific patterns
        boolean found1010 = false;
        boolean found2020 = false;
        
        // Iterate through the array to find patterns (e.g., 1010 and 2020)
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 10 && nums[i + 1] == 10) {
                found1010 = true;
            }

            if (nums[i] == 20 && nums[i + 1] == 20) {
                found2020 = true;
            }
        }

        // Check if the patterns 1010 and 2020 were found and print the result
        System.out.printf(String.valueOf(found1010 != found2020));
        System.out.printf("\n");
    }
}


