import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inp.nextInt();

        if (number <= 0) {
            System.out.println("Invalid number. Please enter a positive integer.");
        } else {
            int sum = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    }
}