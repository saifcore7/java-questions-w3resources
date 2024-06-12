/*35. Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722 */


public class Demo35{
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of sides on the polygon: ");
        int n = sc.nextInt();
        System.out.print("Enter the length of one of the sides: ");
        int s = sc.nextInt();
        System.out.println((n*Math.pow(s,2)) / (4*Math.tan(Math.PI/n)));
    }
}
