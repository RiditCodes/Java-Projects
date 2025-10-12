import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size1 = sc.nextInt();
        int[] array = new int[size1];
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter elements of the array: ");
            array[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.print("\nChoose element to delete: ");
        int del_element = sc.nextInt();

        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != del_element) {
                newArray[j++] = array[i];
            }
        }
            
        System.out.println("Array after deletion:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}