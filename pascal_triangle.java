import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();
        int[][] triangle = new int[rows][rows];

        for (int i = 0; i < rows; i++){
            if (i == 6) {
                System.out.println("(Row 7 is skipped)");
                continue;
            }
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            boolean overflow = false;

            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    triangle[i][k] = 1;
                } else {
                    triangle[i][k] = triangle[i - 1][k - 1] + triangle[i - 1][k];
                }
                if (triangle[i][k] > 1000) {
                    System.out.println("\nValue too large! Breaking out of loop.");
                    overflow = true;
                    break;
                }

                System.out.print(triangle[i][k] + " ");
            }

            System.out.println();
            if (overflow) {
                break; 
            }
        }

        sc.close();
    }
}
/*     
        1 
       1 1 
      1 2 1 
     1 3 3 1 
    1 4 6 4 1 
   1 5 10 10 5 1 
(Row 7 is skipped)
 1 0 0 0 0 0 0 1 
*/