import java.util.Scanner;

public class sort3{
    public static void main(String[] args) {
        Integer arr[] = new Integer[10];
        int swap;
        Scanner sc = new Scanner(System.in);
        for (int k = 0; k < 10; k++) {
            System.out.print("Enter a number: ");
            arr[k] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted array using bubble sort in descending order:");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();

        sc.close();
    }
}