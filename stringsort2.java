import java.util.Scanner;

public class stringsort2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter string: ");
            arr[i] = sc.nextLine();
        }

       for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }

        System.out.println("Sorted strings in ascending order with bubble sort:");
        for (String s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
}