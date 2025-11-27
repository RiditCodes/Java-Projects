import java.util.Scanner;

public class array8 {
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

        int max = 0;
        int secondmax = 0;

        for (int number : array) {
            if (number > max) {
            secondmax = max;
            max = number;
            } else if (number < max && number > secondmax) {
            secondmax = number;
            }
        }

        System.out.println("\nSecond highest element: " + secondmax);

        sc.close();
    }
}