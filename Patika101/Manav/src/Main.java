import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        double pear=2.14,
               apple=3.67,
               tomato=1.11,
               banana=0.95,
               eggplant=5.00;

        int pe,app,tom,ban,egg;

        System.out.print("How much kg of pear: ");
        pe=inp.nextInt();

        System.out.print("How much kg of apple: ");
        app=inp.nextInt();

        System.out.print("How much kg of tomato: ");
        tom=inp.nextInt();

        System.out.print("How much kg of banana: ");
        ban=inp.nextInt();

        System.out.print("How much kg of eggplant: ");
        egg=inp.nextInt();

        double total = (pe*pear)+(app*apple)+(tom*tomato)+(ban*banana)+(egg*eggplant);

        System.out.println("Total price: "+total+" TL");
    }
}