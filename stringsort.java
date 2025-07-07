import java.util.Scanner;

public class stringsort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter string: ");
            arr[i] = sc.nextLine();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].charAt(0) > arr[j + 1].charAt(0)) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted strings in ascending order:");
        for (String s : arr) {
            System.out.println(s);
        }
        sc.close();
    }
}