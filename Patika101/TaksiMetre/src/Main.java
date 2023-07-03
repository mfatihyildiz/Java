import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int km;
        int opening=10;
        double perKm=2.20;

        System.out.print("Enter Distance as KM: ");
        km=inp.nextInt();

        double total= opening+km*perKm;

        double result=(total<20)?20:total;

        System.out.println("Final Payment: "+result);
    }
}