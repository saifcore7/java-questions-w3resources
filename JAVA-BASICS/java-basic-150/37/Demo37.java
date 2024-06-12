/*37. Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT */

public class Demo37{
    public static void main(String[] args) {
        String str = "The quick brown fox";
        char[] ch = str.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println("\n");
    }
}
