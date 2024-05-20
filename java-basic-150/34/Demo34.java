/*
 34. Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
 */

public class Demo34{
    public static void main(String[] args) {
        double s=6.0;
        System.out.println((6.0 * Math.pow(s,2.0))/(4.0 * Math.tan(Math.PI/6.0)));
    }
}
