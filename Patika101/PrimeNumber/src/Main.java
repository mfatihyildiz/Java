import java.util.Scanner;

public class Main {
    static boolean primeNumber(int num,int i){
        int result =0;

        if (i<num){
            if(num % i == 0) {
                result++;
            }
            primeNumber(num,i+1);
        }

        if(result == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = inp.nextInt();

        if (primeNumber(num,2)){
            System.out.println(num + " sayısı Asal Sayıdır!");
        }else System.out.println(num + " sayısı Asal Sayı değildir!");
    }
}