/*39. Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
Expected Output

123                                                      
124                                                      
...                                            
                                                   
431                                                      
432                                                      
Total number of the three-digit-number is 24 */

public class Demo39{
    public static void main(String[] args) {
        int count = 0;
       for(int i = 1; i <= 4; i++ ) {
        for (int j = 1; j <=4; j++) {
            for(int k = 1; k <= 4; k++) {
                if(i!=k && i!=j && j!=k) {
                    System.out.println(i+""+j+""+""+k);
                    count++;
                }
            }
        }
       }
       System.out.println(count);
    }
    
}
