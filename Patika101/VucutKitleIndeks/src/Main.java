import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int kg;
        double m;

        System.out.print("Enter your height as meter: ");
        m=inp.nextDouble();

        System.out.print("Enter your weight: ");
        kg=inp.nextInt();

        double bmi=kg/(m*m);
        System.out.println("Your body mass index is: "+bmi);
    }
}