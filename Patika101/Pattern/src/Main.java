import java.util.Scanner;

public class Main {
    public static void pattern(int number,boolean cond,int temp) {
        System.out.print(number+" ");

        if (number>0&&cond) {
            pattern(number-5,true,temp);
        } else {
            if (number==temp) {
                return;
            }
            pattern(number+5, false,temp);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.print("Output : ");
        pattern(n, true,n);
    }
}