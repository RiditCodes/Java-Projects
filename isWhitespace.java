import java.util.Scanner;

public class isWhitespace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        char[] ch = new char[20];
        ch = scanner.nextLine().toCharArray();
        int count = 0;

        for (char character:ch) {
            if (Character.isWhitespace(character)) {
                count++;
            }
        }

        System.out.println("Total number of characters in the above string is " + count);

        System.out.println(Character.isWhitespace('g'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));

        scanner.close();
    } 
}