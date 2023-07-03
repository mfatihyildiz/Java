import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,biyo,turkce;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat= inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik= inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya= inp.nextInt();

        System.out.print("Biyoloji notunuz: ");
        biyo= inp.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce= inp.nextInt();

        double orta = (mat+fizik+kimya+biyo+turkce)/5.0;
        System.out.println("Ortalamaniz: "+orta);

        String sonuc = (orta<60)?"Sinifta Kaldi" : "Sinifi Gecti";

        System.out.println(sonuc);

    }
}