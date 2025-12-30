import java.util.Scanner;

public class string2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int strlen = input.length();
        char strarr[] = input.toCharArray();

        System.out.println("Length of the string: " + strlen);
        for(int i = 0; i < strarr.length; i++) {
            System.out.println(strarr[i]);
        }
        
        scanner.close();
    }
}