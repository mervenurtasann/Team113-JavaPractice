package StudentPractice;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        System.out.println("Lutfen Yapmak Istediginiz Islemi Seciniz :\n 1- Toplama\n 2 - Cikarma\n 3 - Carpma\n 4 - Bolme");
        Scanner scan = new Scanner(System.in);
        System.out.print("Secilen islem : ");
        int islem = scan.nextInt();
        System.out.println("");
        System.out.print("Ilk sayiyi giriniz : ");
        double sayi1, sayi2, sonuc;
        sayi1 = scan.nextDouble();
        System.out.print("Ikinci sayiyi giriniz : ");
        sayi2 = scan.nextDouble();

        switch (islem) {
            case 1:
                sonuc = sayi1 + sayi2;
                System.out.println("Islem Sonucu : " + sonuc);
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                System.out.println("Islem Sonucu : " + sonuc);
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                System.out.println("Islem Sonucu : " + sonuc);
                break;
            case 4:
                sonuc = sayi1 / sayi2;
                System.out.println("Islem Sonucu : " + sonuc);
                break;
            default:
                System.out.println("Gecersiz islem girdiniz!...");
        }

    }
}
