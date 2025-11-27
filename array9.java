import java.util.Scanner;

public class array9 {
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

        System.out.println("\nEven elements in the array are:");
        for(int i = 0; i < size; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\nOdd elements in the array are:");
        for(int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }

        sc.close();
    }
}
