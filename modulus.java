import java.util.Scanner;

public class modulus{
    public static void main(String[] args){
        int a;
        double b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        a = sc.nextInt();
        System.out.print("Enter another number: ");
        b = sc.nextFloat();

        System.out.println("Modulus of " + a + " with 10 is "+ a % 10);
        System.out.println("Modulus of " + b + " with 10 is "+ b / 10);
    }
}