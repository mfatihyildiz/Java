import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter=1;
        System.out.print("Enter Size : ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements");
        for(int i=0; i < numbers.length; i++){
            System.out.print( "Element "+(i+1)+": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Array : " + Arrays.toString(numbers));
        Arrays.sort(numbers);

        System.out.println("Repeating Numbers ");

        for (int i = 0; i < numbers.length-1; i++) {

             if (numbers[i] == numbers[i+1]) {
                for (int j = 0; j < numbers.length; j++) {
                    if ((i != j) && (numbers[i] == numbers[j])) {
                        counter++;
                    }
                }
                System.out.println("Number "+numbers[i] + " repeated " + counter + " time(s).");
                i+=counter-1;
             }else
                 System.out.println("Number "+numbers[i] + " repeated " + counter + " time(s).");

            counter = 1;
        }
    }
}