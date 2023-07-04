import java.util.Scanner;

public class Main {
    static int Exponential(int base,int power){
        int result=1;
        if (power == 0) {
            return 1;
        }else{
            for (int i=0;i<power;i++){
                result*=base;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int base,power;

        System.out.print("Enter base number: ");
        base = inp.nextInt();
        System.out.print("Enter power number: ");
        power = inp.nextInt();

        System.out.println("Result is: "+Exponential(base,power));
    }
}