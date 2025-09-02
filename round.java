import java.util.Scanner;

public class round{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to round: ");
        double number = sc.nextDouble();
        
        double round = Math.round(number);
   
        System.out.println("Rounded number: " + round);

        System.out.println("Round of 10 is " + Math.round(10f));
        System.out.println("Round of 20.5 is " + Math.round(20.5f));
        System.out.println("Round of -19.4 is " + Math.round(-19.4f));
        System.out.println("Round of -23.5 is " + Math.round(-23.5f));
        
        sc.close();
    }
}