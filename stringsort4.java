import java.util.Scanner;

public class stringsort4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter string: ");
            arr[i] = sc.nextLine();
        }

       for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted strings in descending order with selection sort:");
        for (String s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
}