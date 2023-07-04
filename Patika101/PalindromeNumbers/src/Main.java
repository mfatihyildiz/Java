import java.util.Scanner;

public class Main {

    static int ReverseNumber(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        return reverseNumber;
    }
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number= inp.nextInt();

        if (number == ReverseNumber(number)) {
            System.out.println(number+" is a palindrome number.");
        }else System.out.println(number+" is not a palındrome number.");
    }
}