import java.util.Scanner;

public class array2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an element: ");
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}