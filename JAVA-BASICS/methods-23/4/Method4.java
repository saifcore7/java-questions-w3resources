import java.util.Scanner;
import static java.lang.System.*;

public class Method4 {

    public void vowels(String s)
    {
        String vowela = "AEIOUaeiou";
        int count=0;
        for(char ch : s.toCharArray())
        {
            if(vowela.indexOf(ch) == -1)
                count++;
        }
        out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("Enter a string");
        String str = sc.nextLine();
        new Method4().vowels(str);
    }
}
