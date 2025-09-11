import java.util.Scanner;

public class toChararray{
    public static void main(String[] args){
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = scan.nextLine().toCharArray()[0];
        if (Character.isLetter(ch)){
            System.out.println(ch + " is a letter");
        } else {
            System.out.println(ch + " is not a letter");
        }

        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetter('2'));

        scan.close();
    }
}