import java.util.Scanner;

public class toUppercase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toUpperCase();

        System.out.println("Uppercase String: " + str);
        
        sc.close();
    }
}