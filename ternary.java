import java.util.Scanner;

public class ternary{
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = sc.nextInt();

        String b = (a >= 50) ? "The number entered is greater than or equal to 50" : "The number entered is less than 50";
        System.out.println(b);

        sc.close();
    }
}