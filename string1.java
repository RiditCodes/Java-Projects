import java.util.Scanner;

public class string1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() > 7){
            char Char = input.charAt(7);
            System.out.println("Eighth character: " + Char);
        } else{
            System.out.println("The 8th character does not exist");
        }
        scanner.close();
    }
}