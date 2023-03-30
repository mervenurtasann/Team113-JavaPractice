package week07;

import java.util.Scanner;

public class P02_doWhileLoop {
    /*
    Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde "Sifreniz Kabul edilmistir" yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        String sifre = "";
        do {
            System.out.println("Lutfen bir sifre giriniz : ");
            sifre = scan.nextLine();

            for (int i = 0; i < sifre.length(); i++) {
                if (!(sifre.charAt(i) >= 65 && sifre.charAt(i) <= 90)) {
                    System.out.println("Sifre buyuk harf icermelidir");
                    sayac++;
                }
                if (!(sifre.charAt(i) >= 97 && sifre.charAt(i) <= 122)) {
                    System.out.println("Sifre kucuk harf icermelidir");
                    sayac++;
                }
                if (!(sifre.charAt(i) >= 32 && sifre.charAt(i) <= 64)) {
                    System.out.println("Sifre ozel karakter icermelidir");
                    sayac++;
                }
                if (sifre.length() < 8) {
                    System.out.println("Sifre en az 8 karakter olmalidir");
                    sayac++;
                }
                break;
            }
            if (sayac == 0){
                System.out.println("Sifreniz basariyla kaydedildi");
            }
        } while (sayac != 0);
        System.out.println(sifre);
    }

}
