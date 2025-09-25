import java.util.Scanner;

public class isLowercase{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.nextLine().charAt(0);
        boolean bl = Character.isLowerCase(ch);
        
        if(bl){
            System.out.println(ch + " is a lowercase letter");
        } else {
            System.out.println(ch + " is not a lowercase letter");
        }

        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('r'));
        
        scanner.close();
    }
}