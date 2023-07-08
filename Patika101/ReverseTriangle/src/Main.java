import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner inp = new Scanner(System.in);

        System.out.print("Line numbers: ");
        int line = inp.nextInt();

        int temp = line;
        while (line > 0)
        {
            for (int u = 0; u < temp - line; u++)
            {
                System.out.print(" ");
            }
            int star = (2 * line - 1);
            while (star > 0)
            {
                System.out.print("*");
                star--;
            }
            System.out.println();
            line--;
        }
    }
}