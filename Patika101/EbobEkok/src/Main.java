import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,i=1,ebob=1,ekok=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the small number: ");
        n1 = input.nextInt();
        System.out.print("Enter the larg number: ");
        n2 = input.nextInt();

        while(i <= n1){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " + ebob);


        while(i<=n1*n2){
            if(i%n1==0 && i%n2==0){
                ekok = i;
                break;
            }
            i++;
        }
        System.out.print("Ekok: " + ekok);
    }
}