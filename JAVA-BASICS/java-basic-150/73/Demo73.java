/*73. Write a Java program to create a string taking the first and last characters from two given strings. If the length of each string is 0 use "#" for missing characters.
Test Data: str1 = " Python"
str2 = " "
Sample Output:

P# */

public class Demo73{
    public static void main(String[] args) {
        String str1 = "r", str2 = "";
        System.out.println((str1.length() > 0 && str2.length() > 0)?str1.substring(0,1) + str2.substring(str2.length() - 1, str2.length()):str1.length() == 0?"#" + str2.substring(str2.length() - 1, str2.length()):str2.length() == 0?str1.substring(0, 1) + "#":str1.length() == 0 && );
    }
}
