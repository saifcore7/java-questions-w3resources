/*16. Write a Java method to find all twin prime numbers less than 100.

Expected Output:

(3, 5)                                                   
(5, 7)                                                   
(11, 13)                                                 
(17, 19)                                                 
(29, 31)                                                 
(41, 43)                                                 
(59, 61)                                                 
(71, 73)  */

public class Method16 {

    public static boolean isPrime(int n) {
       if (n < 2) return false;
       for(int i = 2; i < n; i++) {
        if(n % i == 0) return false;
       }
       return true;
    }
    public static void main(String[] args) {
        for(int i = 2; i < 100; i++) {
            if(isPrime(i) && isPrime(i + 2)) {
                System.out.printf("(%d, %d) \n",i,i+2);
            }
        }
    }    
}
