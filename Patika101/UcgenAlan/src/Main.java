import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a,b,c;
        System.out.print("Birinci Kenar: ");
        a= inp.nextInt();

        System.out.print("Ikinci Kenar: ");
        b= inp.nextInt();

        System.out.print("Ucuncu Kenar: ");
        c= inp.nextInt();

        int cevre= a+b+c;
        double u =cevre/2.0;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin Cevresi: "+cevre);
        System.out.println("Ucgenin Alani: "+alan);

    }
}