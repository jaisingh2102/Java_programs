// Java program to count the occurrence of a character in a string
import java.util.Scanner;

public class Main_5 {
    public static void main(String[] args) {
        String str;
        char ch;
        int count = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.print("Enter a character to count: ");
        ch = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("Occurrence of '" + ch + "' is: " + count);
        sc.close();
    }
}
