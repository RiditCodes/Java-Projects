import java.util.Scanner;

public class InputProg{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        System.out.println("The entered no. is: " + number);
    }
}