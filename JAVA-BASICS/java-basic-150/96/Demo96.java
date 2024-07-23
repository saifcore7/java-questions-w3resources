/*96. Write a Java program to check if there is a
 10 in an array of integers with a 20 somewhere later on.*/

public class Demo96{
    public static void main(String args[]) {
        int[] a = {1,2,3,4,20,3,4,10,9,7,9,20}; boolean count = false;
        int j = 0,count10 = 0, count20 = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 10) {
                j = i; count10++;
                for(int k = j; k < a.length; k++) {
                if(a[k] == 20) {
                    count = true;
                    count20++;
                }
            }
        }
    }
    System.out.println("No of 10 found => " + count10 + "\n" + "No of 20 found => " + count20);
    if(count) System.out.println(count + ":" + " 10 => " + j + " 20 => ");
    else System.out.println(count);
}
}