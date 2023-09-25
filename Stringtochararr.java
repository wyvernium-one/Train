import java.util.*;
public class Stringtochararr
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String");
            String s = sc.nextLine();
            sc.close();
            System.out.println();
            for (char c : s.toCharArray())
            {
                System.out.print(c);
            }
        }
}