import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int r,alpha;
        double pi=3.14;

        System.out.print("Enter radius: ");
        r=inp.nextInt();

        System.out.print("Enter alpha: ");
        alpha=inp.nextInt();

        double area=pi*r*r;
        double circumference=pi*r*2;
        double segment=(area*alpha)/360;

        System.out.println("Area: "+area);
        System.out.println("Circumference: "+circumference);
        System.out.println("Area of the circle segment: "+segment);

    }
}