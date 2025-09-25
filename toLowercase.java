import java.util.Scanner;

public class toLowercase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String lowercased = input.toLowerCase();
        System.out.println("Original String: " + input);
        System.out.println("Lowercased String: " + lowercased);
        
        sc.close();
    }
}