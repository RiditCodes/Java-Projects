import java.util.Scanner;

public class Comparison{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer a;
        System.out.print("Enter number: ");
        a = sc.nextInt();
        System.out.println(a.compareTo(20));
        System.out.println(a.compareTo(4));
        System.out.println(a.compareTo(17));

        sc.close();
    }
}