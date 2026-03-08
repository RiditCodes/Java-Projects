import java.util.Scanner;

public class pascal_triangle2{
    public static int pascal(int row, int col){
        if (col == 0 || col == row){
            return 1;
        }
        return pascal(row - 1, col - 1) + pascal(row - 1, col);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print(pascal(i, k) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}