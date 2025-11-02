import java.util.Scanner;

public class array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("\nSum of all elements: " + sum);

        int max = array[0];
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum element: " + max);

        sc.close();
    }
}