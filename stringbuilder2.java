import java.util.Scanner;

class stringbuilder2{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Your name is ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        sb.append(name);
        System.out.println(sb);

        sb.delete(0, 13);
        System.out.println("After deletion: " + sb);

        sc.close();
    }
}