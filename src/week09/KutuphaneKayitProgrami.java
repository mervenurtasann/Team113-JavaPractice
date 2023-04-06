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
        static ArrayList<Kitap> kutuphane = new ArrayList<>();

        // Kitap nesnesi methodu

        public Kitap(String ad, String yazarAdi, String yayinEvi, int yayinYili) {
            this.ad = ad;
            this.yazarAdi = yazarAdi;
            this.yayinEvi = yayinEvi;
            this.yayinYili = yayinYili;
        }
        public void kitapYazdir() {
            System.out.print("Kitap Adi : " + ad);
            System.out.print("Yazar Adi : " + yazarAdi);
            System.out.print("Yayınevi Adi : " + yayinEvi);
            System.out.print("Kitabın Baski Yili : " + yayinYili);
        }

        public static void main(String[] args) {
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
                System.out.print("Seciminiz : ");
                secim = scan.nextInt();

                switch (secim) {
                    case 1:
                        scan.nextLine();
                        System.out.print("Kitap Adi : ");
                        String ad = scan.nextLine();
                        System.out.print("Yazar Adi : ");
                        String yazar = scan.nextLine();
                        System.out.print("Yayinevi Adi : ");
                        String yayineviAdi = scan.nextLine();
                        System.out.print("Kitap Baski Yili : ");
                        int yayinYili = scan.nextInt();

                        // girilen bilgileri kutuphane listesine ekleyecegiz

                        Kitap kitap = new Kitap(ad, yazar, yayineviAdi, yayinYili);
                        kutuphane.add(kitap);
                        System.out.println("Kitap Basariyla Eklendi");

                        break;
                    case 2:
                        System.out.println("Kutuphaneye Eklenmis Kitaplar Listesi");
                        System.out.println("---------------------------------------");
                        for (Kitap k : kutuphane
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
