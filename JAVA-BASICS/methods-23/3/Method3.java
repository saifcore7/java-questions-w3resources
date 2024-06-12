import java.util.Scanner;
import static java.lang.System.*;

public class Method3 {

    public void middleNumber(String s) {

        if (s.length() % 2 == 0)
            System.out.println(s.charAt(s.length() / 2 - 1) + "" + s.charAt(s.length() / 2));
        else
            System.out.println(s.charAt(s.length() / 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Method3 obj = new Method3();
        out.println("Enter the String");
        String str = sc.nextLine();
        obj.middleNumber(str);
    }
}
