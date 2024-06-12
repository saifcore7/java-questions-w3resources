/*38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6 */

public class Demo38{
    public static void main(String[] args) {
        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] ch = str.toCharArray();
        int space = 0, num = 0, letter = 0, other = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') {
                space++;
            }
            else if (ch[i] >= '0' && ch[i] <= '9') {
                num++;
            }
            else if((ch[i] >= 'a' && ch[i] <='z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
                letter++;
            }
            else {
                other++;
            }
        }
        System.out.println("Space are " + space + "\n" + "Numbers are " + num + "\n" + "Letter are " + letter + "\n" + "Other are " + other);
    }
}
