import java.util.Scanner;

public class array11 {
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

        int min = array[0];
        int secondmin = array[size - 1];

        for (int number : array) {
            if (number < min) {
                secondmin = min;
                min = number;
            } else if (number > min && number < secondmin) {
                secondmin = number;
            }
        }

        System.out.println("\nSecond lowest element: " + secondmin);

        sc.close();
    }
}