import java.util.Scanner;

class stringbuffer3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse();

        System.out.println("Reversed string: " + stringBuffer.toString());
        scanner.close();
    }
}