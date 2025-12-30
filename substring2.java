import java.util.Scanner;

class substring2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = "My name is Sachin Tendulkar";
        String substr = str.substring(11);
        System.out.println("The substring is: " + substr);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        substr = str.substring(0, 11) + name;

        System.out.println(substr);

        scanner.close();
    }
}