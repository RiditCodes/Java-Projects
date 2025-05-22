import java.util.Scanner;

public class stringconcat{
    public static void main(String[] args){
        String a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        a = sc.nextLine();
        System.out.print("Enter another string: ");
        b = sc.nextLine();
        
        c = a + " " + b;
        System.out.println("Concatenated string: " + c);

        sc.close();
    }
}