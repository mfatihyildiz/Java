import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp =new Scanner(System.in);

        int num1,num2,ope;

        System.out.print("Enter first number: ");
        num1=inp.nextInt();

        System.out.print("Enter second number: ");
        num2=inp.nextInt();

        System.out.print("1-Add\n2-Sub\n3-Mul\n4-Div\nChoose the operation:");
        ope=inp.nextInt();

        switch (ope){
            case 1:
                System.out.println("Result is: "+(num1+num2));
                break;
            case 2:
                System.out.println("Result is: "+(num1-num2));
                break;
            case 3:
                System.out.println("Result is: "+(num1*num2));
                break;
            case 4:
                System.out.println("Result is: "+(num1/Double.valueOf(num2)));
                break;
        }
    }
}