/*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5


Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */
public class Demo13{
    public static void main(String[] args) {
        double Width = 5.5, Height = 8.5;

        System.out.println("Area is " + Width + " * " + Height + " = " + Width * Height);
        System.out.println("Perimeter is 2 * (" + Width + " + " + Height + ") = " + 2 * (Width + Height));

    }
}
