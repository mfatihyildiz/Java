import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

            System.out.print("Mayın Tarlası boyutunu girin: ");
            int size = inp.nextInt();

            MineSweeper mineSweeper = new MineSweeper(size);
            mineSweeper.initializeBoard();
            mineSweeper.play();

            inp.close();
        }
}