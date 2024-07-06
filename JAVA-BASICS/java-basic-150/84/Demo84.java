/*84. Write a Java program to take the last three characters from a given string. It will add the three characters at both the front and back of the string. String length must be greater than three and more.
Test data: "Python" will be "honPythonhon"
Sample Output:

honPythonhon*/

public class Demo84{
    public static void main(String[] args) {
        String str = "Python";
        System.out.println(str.substring(str.length() - 3, str.length()) + str + str.substring(str.length() - 3, str.length()));
    }
}
