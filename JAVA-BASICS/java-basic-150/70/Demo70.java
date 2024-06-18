/*70. Write a Java program to create a string in the form of short_string + long_string + short_string from two strings. The strings must not have the same length.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:

PythonTutorialPython */

public class Demo70{
    public static void main(String[] args) {
        String str1 = "python";
        String str2 = "tutorial";
        System.out.println((str1.length() > str2.length())?str2 + str1 + str2:"test");
    }
}
