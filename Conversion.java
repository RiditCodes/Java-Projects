import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
        Integer a;
        byte b;
        long c;
        double d;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        b = a.byteValue();
        c = a.longValue();
        d = a.doubleValue();
        System.out.println("Integer: " + a);
        System.out.println("Byte: " + b);
        System.out.println("Long: " + c);
        System.out.println("Double: " + d);

        sc.close();
    }
}