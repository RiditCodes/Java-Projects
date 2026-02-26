import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();
        int[][] triangle = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    triangle[i][k] = 1;
                }
                else {
                    triangle[i][k] = triangle[i-1][k-1] + triangle[i-1][k];
                }
                System.out.print(triangle[i][k] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
}
