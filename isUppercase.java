import java.util.Scanner;

public class isUppercase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.nextLine().charAt(0);
        boolean bl = Character.isUpperCase(ch);
        
        if(bl){
            System.out.println(ch + " is an uppercase letter");
        } else {
            System.out.println(ch + " is not an uppercase letter");
        }

        System.out.println(Character.isUpperCase('R'));
        System.out.println(Character.isUpperCase('i'));
        
        scanner.close();
    }
}