import java.util.Scanner;

public class rint{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();

        double rint_num = Math.rint(number);

        System.out.println("Original number: " + number);
        System.out.println("Rounded number: " + rint_num);
        
        sc.close();
    }
}