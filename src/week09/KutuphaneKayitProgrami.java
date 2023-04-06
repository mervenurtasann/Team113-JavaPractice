package week09;

import java.util.ArrayList;
import java.util.Scanner;

public class KutuphaneKayitProgrami {
    // Kitap Sinifi

    static class Kitap {
        String ad;
        String yazarAdi;
        String yayinEvi;
        int yayinYili;

        // Kitap nesnesi methodu

        public Kitap(String ad, String yazarAdi, String yayinEvi, int yayinYili) {
            this.ad = ad;
            this.yazarAdi = yazarAdi;
            this.yayinEvi = yayinEvi;
            this.yayinYili = yayinYili;
        }

        // kitap ozelliklerini yazdiran constructor
        public void kitapYazdir() {
            System.out.println("Kitap Adi : " + ad);
            System.out.println("Yazar Adi : " + yazarAdi);
            System.out.println("Yayınevi Adi : " + yayinEvi);
            System.out.println("Kitabın Baski Yili : " + yayinYili);
        }

        public static void main(String[] args) {
            ArrayList<Kitap> kutuphane = new ArrayList<>();
            Scanner scan = new Scanner(System.in);

            // Kutuphane giris menusu
            System.err.println("Kutuphane Kayit Sistemi");
            System.err.println("---------------------------");
            System.out.println("Yapmak istediginiz islemi seciniz : ");
            System.out.println("1- Kitap Ekle");
            System.out.println("2- Kitaplari Listele");
            System.out.println("3- Sistemden Cik");

            int secim = 0;
            while (secim != 3) {
                System.out.print("Seciminiz : " );
                secim = scan.nextInt();

                switch (secim) {
                    case 1:
                        scan.nextLine();
                        System.out.println("Kitap Adi : ");
                        String ad = scan.nextLine();
                        System.out.println("Yazar Adi : ");
                        String yazar = scan.nextLine();
                        System.out.println("Yayinevi Adi : ");
                        String yayineviAdi = scan.nextLine();
                        System.out.println("Kitap Baski Yili : ");
                        int yayinYili = scan.nextInt();

                        // girilen bilgileri kutuphane listesine ekleyecegiz

                        Kitap kitap = new Kitap(ad,yazar,yayineviAdi,yayinYili);
                        kutuphane.add(kitap);
                        System.out.println("Kitap Basariyla Eklendi");

                        break;
                    case 2 :
                        System.out.println("Kutuphaneye Eklenmis Kitaplar Listesi");
                        System.out.println("---------------------------------------");
                        for (Kitap k: kutuphane
                             ) {
                            k.kitapYazdir();
                            System.out.println("-----------------------------------");
                        }
                        break;
                    case 3:
                        System.out.println("Programdan cikis yapiliyor");
                        break;
                    default:
                        System.out.println("Hatali giris yaptiniz, Tekrar deneyiniz");
                        break;
                }
            }
            scan.close();
        }
    }
}
