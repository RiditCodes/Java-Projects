import java.util.Scanner;

public class array7{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
       
        int[] ascending = array.clone();
        int[] descending = array.clone();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ascending[j] > ascending[j + 1]) {
                    int temp = ascending[j];
                    ascending[j] = ascending[j + 1];
                    ascending[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (descending[j] < descending[j + 1]) {
                    int temp = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = temp;
                }
            }
        }
        
        System.out.println("\nArray in ascending order:");
        for (int value : ascending) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        System.out.println("\nArray in descending order:");
        for (int value : descending) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
