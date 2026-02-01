import java.util.Scanner;

class setLength2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        StringBuffer sb = new StringBuffer(input);

        System.out.print("Enter length of StringBuffer: ");
        int length = scanner.nextInt();
        
        System.out.println("\nOriginal Stringbuffer: " + sb);
        System.out.println("Capacity of Stringbuffer: " + sb.capacity());
        sb.setLength(length);
        System.out.println("Modified Stringbuffer: " + sb);
        System.out.println("Capacity of Stringbuffer after modification: " + sb.capacity());
        
        scanner.close();
    }
}