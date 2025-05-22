import java.util.Scanner;

public class Float{
    public static void main(String args[]){
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float number: ");
        num = sc.nextFloat();
        System.out.println("You entered: " + num);

        sc.close();
    }
}