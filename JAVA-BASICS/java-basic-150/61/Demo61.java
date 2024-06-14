/*61. Write a Java program to reverse a word.
Sample Output:

Input a word: dsaf
Reverse word: fasd
 */

public class Demo61{
    public static void main(String[] args) {
        String str = "dsaf";
        char[] ch = str.toCharArray();
        for(int i = ch.length - 1; i >=0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
