import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int age,km,way;
        double normalPrice=0.0,ageDiscount=0.0,discPrice=0.0,returnDiscount=0.0,totalPrice=0.0;
        double kmPrice=0.1,Disc12=0.5,Disc24=0.1,Disc65=0.3,DiscReturn=0.2;
        
        System.out.print("Distance as KM: ");
        km=inp.nextInt();
        System.out.print("Your Age: ");
        age=inp.nextInt();
        System.out.print("One Way or Return (1/2): ");
        way=inp.nextInt();

        if(age>=1&&km>=1&&(way==1||way==2)){
            normalPrice=km*kmPrice;

            if (age<=12) {
                ageDiscount=normalPrice*Disc12;
            }else if (age>12&&age<=24) {
                ageDiscount=normalPrice*Disc24;
            }else if (age>=65) {
                ageDiscount=normalPrice*Disc65;
            }

            discPrice=normalPrice-ageDiscount;

            if (way==2) {
                returnDiscount=discPrice*DiscReturn;
                totalPrice=(discPrice-returnDiscount)*2;
            }else
                totalPrice=discPrice;

            System.out.println("Normal Price: "+normalPrice);
            System.out.println("Age Discount: "+ageDiscount);
            System.out.println("Discounted Price: "+discPrice);
            System.out.println("Return Discount: "+returnDiscount);
            System.out.println("Total Price: "+totalPrice);

        }else System.out.println("Inputs are Incorrect");
    }
}