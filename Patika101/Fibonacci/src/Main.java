import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n,i,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Number of steps:");
        n = input.nextInt();

        int num1=0;
        int num2=1;
        for(i=1;i<=n;i++){
            System.out.print(num1 + " ");
            sum = num1+num2;
            num1=num2;
            num2=sum;
        }
    }
}