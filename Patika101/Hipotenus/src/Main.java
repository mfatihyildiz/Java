import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a,b;
        double c;

        System.out.print("Birinci Kenar: ");
        a=inp.nextInt();

        System.out.print("Ikinci Kenar: ");
        b=inp.nextInt();

        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenus: "+c);
    }
}