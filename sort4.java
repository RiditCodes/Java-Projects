import java.util.Scanner;

public class sort4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        Integer arr[] = new Integer[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array using selection sort in descending order:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}