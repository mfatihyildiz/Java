import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Column Size : ");
        int column = input.nextInt();
        System.out.print("Enter Row Size : ");
        int row = input.nextInt();
        int[][] matrix = new int[column][row];
        System.out.println("Enter the elements");
        for(int i=0; i < column; i++){
            for (int j = 0; j < row ; j++) {
                System.out.print( "Element "+"["+i+"]"+"["+j+"]"+": ");
                matrix[i][j] = input.nextInt();
            }

        }
        int[][] transpose = new int[row][column];

        System.out.println("Matrix : ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of the matrix : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
        }
    }
}