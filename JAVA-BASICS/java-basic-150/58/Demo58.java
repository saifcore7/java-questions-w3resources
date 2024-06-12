/*58. Write a Java program to capitalize the first letter of each word in a sentence.
Sample Output:

Input a Sentence: the quick brown fox jumps over the lazy dog.         
The Quick Brown Fox Jumps Over The Lazy Dog. */

public class Demo58{
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        char[] ch = str.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i = 1; i < ch.length; i++) {
            if(ch[i] == ' ') {
                ch[i+1] = Character.toUpperCase(ch[i+1]);
            }
        }
        System.out.println(ch);
    }
}
