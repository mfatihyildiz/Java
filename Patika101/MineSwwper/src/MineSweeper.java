import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private int[][] board;
    private boolean[][] mineLocations;
    private int size;
    private int totalMines;
    private int uncoveredCount;

    public MineSweeper(int size) {
        this.size = size;
        this.totalMines = size * size / 4;
        this.board = new int[size][size];
        this.mineLocations = new boolean[size][size];
        this.uncoveredCount = 0;
    }

    public void initializeBoard() {
        // Tüm noktalara 0 değerini atayalım
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }

        // Mayınları yerleştirelim
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < totalMines) {
            int row = random.nextInt(size);
            int col = random.nextInt(size);
            if (!mineLocations[row][col]) {
                mineLocations[row][col] = true;
                minesPlaced++;
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;

        while (!gameOver) {
            printBoard();

            System.out.print("Satır girin: ");
            int row = scanner.nextInt();
            System.out.print("Sütun girin: ");
            int col = scanner.nextInt();

            if (!isValidPoint(row, col)) {
                System.out.println("Geçersiz bir nokta girdiniz. Lütfen tekrar deneyin.");
                continue;
            }

            if (mineLocations[row][col]) {
                gameOver = true;
                System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
            } else {
                int minesCount = countAdjacentMines(row, col);
                board[row][col] = minesCount;
                uncoveredCount++;

                if (uncoveredCount == size * size - totalMines) {
                    gameOver = true;
                    System.out.println("Tebrikler! Tüm mayınları buldunuz. Oyunu kazandınız.");
                }
            }
        }

        scanner.close();
    }

    private boolean isValidPoint(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    private int countAdjacentMines(int row, int col) {
        int count = 0;

        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValidPoint(i, j) && mineLocations[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
