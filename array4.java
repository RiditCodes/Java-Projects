import java.util.Scanner;

public class array4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size1 = sc.nextInt();
        int[] array = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter elements of the array: ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nOriginal array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nEnter the element to be inserted: ");
        int insertele = sc.nextInt();

        System.out.print("Enter the position: ");
        int insertpos = sc.nextInt();

        int newArray[] = new int[size1 + 1];

        for (int i = size1; i > insertpos; i--) {
            newArray[i] = array[i - 1];
        }
        newArray[insertpos] = insertele;
        for (int i = 0; i < insertpos; i++) {
            newArray[i] = array[i];
        }

        System.out.println("\nArray after insertion:");
        for (int num : newArray) {
                System.out.print(num + " ");
            }

        sc.close();
    }
}