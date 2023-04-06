package week06;

import javax.xml.crypto.Data;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class F02_WiseMarket {

    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static String sepet = "";
    static int urunFiyati;
    static int urunKodu;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun = false;
    /*
         ====================PROJEMIZ===================================
         * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
        1 ŞARKÜTERİ ÜRÜNLERİ
        2 MANAV ÜRÜNLERİ
        3 MARKET
        secime gore ,
        4-urunleri listele ve
        5-fiyatlari gelsin
        */

    public static void main(String[] args) {
        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("======== WISE MARKET'E HOSGELDINIZ ========");
        System.out.println("---------------- M E N U ----------------");
        System.out.println("Lutfen alisveris yapmak istediginiz reyonu seciniz");
        System.out.println("1- Manav Reyonu\n2- Sarkuteri Reyonu\n3- Market Reyonu\n4- Fis yazdir\n5- Cikis");
        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Lutfen gecerli bir deger giriniz");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fis();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }

    private static void cikis() {
        scan.close();
        System.exit(0);
    }

    private static void fis() {
        System.out.println("====== WISE MARKET ======");
        System.out.println("Alıverisinizde bizi tercih ettiginiz icin\n Tesekkur ederiz.");
        System.out.println(sepet);
        System.out.println("Alısverısınızın toplam tutari : " + toplam);
        System.out.println("");

        System.out.println("Musterinin verdigi miktari giriniz");
        int odeme = scan.nextInt();
        while (odeme < toplam) {
            System.out.println("Verdiginiz miktar alisveris icin yeterli degildir");
            odeme = scan.nextInt();
        }
        System.out.println("Odediginiz Miktar : " + odeme);
        System.out.println("ALisveris Tutari : " + toplam);
        System.out.println("Para Ustu : " + (odeme - toplam));
        System.out.println("");
        System.out.println("Iyi Gunler Dileriz");
        cikis();
    }

    private static void market() {
        System.out.println("Lutfen almak istediginiz urunu seciniz : \n10- Nutella 750g 85₺\n11- Cay 70₺\n12- Seker 60₺\n13- Gullac 45₺\n14- Un 53₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 10 && urunKodu <= 14) {
                System.out.println("Kac paket alacaksiniz : ");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 10:
                        urunAdi = "Nutella 750g";
                        urunFiyati = 85;
                        System.out.println(urunAdedi + " adet " + urunAdi + " " + (urunFiyati * urunAdedi) + " TL'dir");
                        break;
                    case 11:
                        urunAdi = "Cay";
                        urunFiyati = 70;
                        System.out.println(urunAdedi + " adet " + urunAdi + " " + (urunFiyati * urunAdedi) + " TL'dir");
                        break;
                    case 12:
                        urunAdi = "Seker";
                        urunFiyati = 60;
                        System.out.println(urunAdedi + " adet " + urunAdi + " " + (urunFiyati * urunAdedi) + " TL'dir");
                        break;
                    case 13:
                        urunAdi = "Gullac";
                        urunFiyati = 45;
                        System.out.println(urunAdedi + " adet " + urunAdi + " " + (urunFiyati * urunAdedi) + " TL'dir");
                        break;
                    case 14:
                        urunAdi = "Un";
                        urunFiyati = 53;
                        System.out.println(urunAdedi + " adet " + urunAdi + " " + (urunFiyati * urunAdedi) + " TL'dir");
                        break;
                }
                urunFiyati *= urunAdedi;
                toplam += urunFiyati;
                System.out.println("Toplam fiyat : " + toplam);
                sepet += urunAdi + " : " + urunFiyati + " TL'dir\n";
                System.out.println("Ek urun almak isterseniz urun kodunu giriniz. Istemiyorsaniz ana menuye donmek icin 0 tusuna basiniz ");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
        ekUrun = false;
    }

    private static void sarkuteri() {
        System.out.println("Lutfen alacaginiz urun kodunu seciniz : \n6- Kasar Peyniri 130₺\n7- Zeytin 50₺\n8- Pastirma 450₺\n9- Kiyma 140₺ ");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 6 && urunKodu <= 9) {
                System.out.println("Kac kg alacaksiniz : ");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 6:
                        urunAdi = "Kasar Peyniri";
                        urunFiyati = 130;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 7:
                        urunAdi = "Zeytin";
                        urunFiyati = 50;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 8:
                        urunAdi = "Pastirma";
                        urunFiyati = 450;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 9:
                        urunAdi = "Kiyma";
                        urunFiyati = 140;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                }
                urunFiyati = urunAdedi * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Toplam Fiyat : " + toplam);
                sepet += urunAdi + " : " + urunFiyati + " TL'dir\n";
                System.out.println("Ek urun almak istiyorsaniz ilgili urun kodunu giriniz.Eger almak istemiyorsaniz 0 tusuna basiniz");

            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void manav() {
        System.out.println("Lutfen alacaginiz urun kodunu seciniz :\n1- Patates - 12₺\n2- Sogan - 12₺\n3- Elma - 15₺\n4- Portakal - 20₺\n5- Ananas - 30₺");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 1 && urunKodu <= 5) {
                System.out.println("Kac kg alacaksiniz ?");
                urunAdedi = scan.nextInt();
                switch (urunKodu) {
                    case 1:
                        urunAdi = "Patates";
                        urunFiyati = 12;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 2:
                        urunAdi = "Sogan";
                        urunFiyati = 12;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 3:
                        urunAdi = "Elma";
                        urunFiyati = 15;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 4:
                        urunAdi = "Portakal";
                        urunFiyati = 20;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    case 5:
                        urunAdi = "Ananas";
                        urunFiyati = 30;
                        System.out.println(urunAdedi + " kg " + urunAdi + " fiyati : " + urunFiyati * urunAdedi + "TL'dir");
                        break;
                    default:
                }
                urunFiyati = urunFiyati * urunAdedi;
                toplam += urunFiyati;
                System.out.println("Olusan sepet tutari : " + toplam);
                sepet += urunAdi + " : " + urunFiyati + " TL'dir\n";
                System.out.println(sepet);
                System.out.println("Baska urun almak ister misiniz? Eger baska urun almak isterseniz urun kodunu giriniz\nAna menuye donmek icin 0'a basiniz");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }
}
