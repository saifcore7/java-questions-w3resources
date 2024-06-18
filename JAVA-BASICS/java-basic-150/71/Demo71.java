/*71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
Test Data: Str1 =  Python
Str2 = Tutorial
Sample Output: */

public class Demo71{
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";
        System.out.println(str1.substring(1,str1.length()) + str2.substring(1,str2.length()));
    }
}
