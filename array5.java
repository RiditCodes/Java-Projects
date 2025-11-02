import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size + 1];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array:");
        for (int i = 0; i < size; i++){ 
            System.out.print(array[i] + " ");
        }

        System.out.print("\n\nEnter the element to be inserted: ");
        int insertElement = sc.nextInt();

        System.out.print("Enter the position: ");
        int insertPos = sc.nextInt() - 1;

        for (int i = size; i > insertPos; i--) {
            array[i] = array[i - 1];
        }

        array[insertPos] = insertElement;

        System.out.println("\nArray after insertion:");
        for (int j = 0; j < size + 1; j++){
            System.out.print(array[j] + " ");
        }

        sc.close();
    }
}

// 1 2 4 5 0 6