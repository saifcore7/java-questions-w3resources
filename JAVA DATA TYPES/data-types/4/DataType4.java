/*convert min to year and days */

public class DataType4 {
    
    public static void main(String[] args) {
        int min = 3456789; 
        System.out.println(min + " minutes is approx. " + ((min / 60) / 24) / 365 + " years and " + ((min / 60) / 24) % 365 + " days");
    }
}
