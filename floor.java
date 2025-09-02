import java.util.Scanner;

public class floor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double num = sc.nextDouble();
        double floor = Math.floor(num);
        System.out.println("Floor of " + num + " is: " + floor);

        double num2 = Math.floor(10);
        double num3 = Math.floor(10.1);
        double num4 = Math.floor(5.5);
        double num5 = Math.floor(-20);
        double num6 = Math.floor(-42.4);
        double num7 = Math.floor(0);

        System.out.println("Floor of 10: " + num2);
        System.out.println("Floor of 10.1: " + num3);
        System.out.println("Floor of 5.5: " + num4);
        System.out.println("Floor of -20: " + num5);
        System.out.println("Floor of -42.4: " + num6);
        System.out.println("Floor of 0: " + num7);

        sc.close();
    }
}