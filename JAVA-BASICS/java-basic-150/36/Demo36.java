/*
 * 36. Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output


 */
//0.4363323129985824 0.619591884457987 0.6108652381980153 0.44505895925855404
public class Demo36{

    private final static double r = 6371.01; 
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the latitude of coordinate 1: ");
        double x1 = sc.nextDouble();
        x1 = Math.toRadians(x1);
        System.out.print("Enter the longitude of the coordinate 1: ");
        double x2 = sc.nextDouble();
        x2 = Math.toRadians(x2);
        System.out.print("Enter the latitude of coordinate 2: ");
        double y1 = sc.nextDouble();
        y1 = Math.toRadians(y1);
        System.out.print("Enter the longitude of cordinate 2: ");
        double y2 = sc.nextDouble();
        y2 = Math.toRadians(y2);
        System.out.println(x1 + ""+ x2 + "" + y1 + "" + y2);
        System.out.println("The distance is " + r * Math.acos(Math.sin(x1) * Math.sin(y1) + Math.cos(x1) * Math.cos(y1) * Math.cos(x2 - y2)) + " km");
    }
}
