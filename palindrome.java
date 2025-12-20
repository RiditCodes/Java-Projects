import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        char strarr[] = input.toCharArray();

        char[] temp = new char[strarr.length];
        for (int i = 0; i < strarr.length; i++) {
            temp[i] = strarr[strarr.length - 1 - i];
        }

        String reversed = new String(temp);
        
        if (input.equals(reversed)){
            System.out.println(input + " is a palindrome.");
        } else{
            System.out.println(input + " is not a palindrome.");
        }
        
        scanner.close();
    }
}