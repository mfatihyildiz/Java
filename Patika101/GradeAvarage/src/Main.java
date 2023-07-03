import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya,biyo,turkce,toplam=0;
        double sayac=0.0;

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

        if (mat>=0&&mat<=100) {
            toplam+=mat;
            sayac++;
        }
        if (fizik>=0&&fizik<=100) {
            toplam+=fizik;
            sayac++;
        }
        if (kimya>=0&&kimya<=100) {
            toplam+=kimya;
            sayac++;
        }
        if (biyo>=0&&biyo<=100) {
            toplam+=biyo;
            sayac++;
        }
        if (turkce>=0&&turkce<=100) {
            toplam+=turkce;
            sayac++;
        }

        double ortalama =toplam/sayac;
        System.out.println("Ortalamaniz: "+ortalama);
        String sonuc = (ortalama<55)?"Sinifta Kaldi" : "Sinifi Gecti";
        System.out.println(sonuc);

    }
}