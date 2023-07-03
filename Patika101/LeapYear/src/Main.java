import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);

        int year;
        System.out.print("Enter a Year: ");
        year=inp.nextInt();

        if(year%4==0){
            if (year%100==0&&year%400==0) {
                System.out.println(year+" is a leap year.");
            }else if(year%100==0&&year%400!=0){
                System.out.println(year+" is not a leap year.");
            }else System.out.println(year+" is a leap year.");
        }else System.out.println(year+" is not a leap year.");
    }
}