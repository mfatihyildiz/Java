import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        System.out.println("Sorted Array: "+Arrays.toString(numbers));
    }
}