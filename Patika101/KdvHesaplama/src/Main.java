//If ve Else kullanmadan

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fiyat Giriniz: ");
        fiyat= inp.nextDouble();

        double KdvOrani = (fiyat<1000)? 0.18:0.08;
        System.out.println("KDV Oraniniz %"+KdvOrani*100);

        double KdvTutari = fiyat*KdvOrani;
        double KdvliTutar = fiyat+KdvTutari;

        System.out.println("KDV Tutari: "+KdvTutari);
        System.out.println("KDV'li Fiyat: "+KdvliTutar);
    }
}