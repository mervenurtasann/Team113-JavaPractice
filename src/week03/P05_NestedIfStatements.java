package week03;

import java.util.Scanner;

public class P05_NestedIfStatements {
    public static void main(String[] args) {
        /*
          1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
           KURALLAR
            : 1999 yili 9.ay oncesi ise baslamis olmak
            : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
            : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */

         Scanner scan = new Scanner(System.in);
        // System.out.println("Ise baslama yilinizi ve ayinizi 1999.09 seklinde giriniz : ");
        // double giris = scan.nextDouble();
        // if (giris >1999.09){
        //     System.out.println("Siz EYT Kanun düzenlenmesine tabi degilsiniz");
        // } else {
        //     System.out.println("Lutfen cinsiyetinizi E ya da K olarak giriniz");
        //     char cinsiyet = scan.next().toLowerCase().charAt(0);
        //     System.out.println("Lutfen prim gun sayinizi giriniz : ");
        //     int primGun = scan.nextInt();
        //     System.out.println("Lutfen hizmet surenizi yil olarak giriniz : ");
        //     int yil = scan.nextInt();
//
        //     if (cinsiyet == 'E' || cinsiyet == 'e'){
        //         if (primGun >= 5500 && yil >= 25){
        //             System.out.println("Tebrikler EYT Kanunu yururluge girdigi zaman emekli olabilirsiniz!");
        //         } else if (primGun < 5500 && yil >= 25) {
        //             System.out.println("Kanun yururluge girince" + (5500 - primGun) +
        //                     " gun sartini tamamlamamiz gerekmektedir");
        //         } else if (primGun >= 5500 && yil <25) {
        //             System.out.println("Kanun yururluge girdiginde" + (25 - yil) +
        //                     " yil daha calismalisiniz");
        //         } else {
        //             System.out.println("Maalesef iki sarti da saglamiyorsunuz");
        //         }
        //     } else if (cinsiyet =='K' || cinsiyet == 'k') {
        //         if (primGun >= 5000 && yil >= 20){
        //             System.out.println("Tebrikler EYT Kanunu yururluge girdigi zaman emekli olabilirsiniz!");
        //         } else if (primGun < 5000 && yil >= 20) {
        //             System.out.println("Kanun yururluge girince" + (5000 - primGun) +
        //                     " gun sartini tamamlamamiz gerekmektedir");
        //         } else if (primGun >= 5000 && yil <20) {
        //             System.out.println("Kanun yururluge girdiginde" + (20 - yil) +
        //                     " yil daha calismalisiniz");
        //         }else {
        //             System.out.println("Maalesef iki sarti da saglamiyorsunuz");
        //         }
        //     } else {
        //         System.out.println("Yanlis bir deger girdiniz");
        //     }
        // }

         /*
            2-Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
            karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
            %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
            alirsa %15, yoksa %10 indirim yapin
         */

        System.out.println("Lutfen urun adedini ve toplam fiyati giriniz : ");
        int adet =scan.nextInt();
        double listeFiyati = scan.nextDouble();
        System.out.println("T113 kart kullaniyor musunuz? E/H : ");
        char kart = scan.next().charAt(0);

        if (kart == 'E' || kart == 'e'){
            if (adet > 10){
                System.out.println("%20 indirimli olarak odemeniz gereken tutar : " + (listeFiyati*adet*0.8));
            }else {
                System.out.println("%15 indirimli olarak odemeniz gereken tutar : " + (listeFiyati*adet*0.85));
            }
        }else if (kart == 'H' || kart == 'h'){
            if (adet >10){
                System.out.println("%15 indirimli olarak odemeniz gereken tutar : " + (listeFiyati*adet*0.85));
            }else {
                System.out.println("%10 indirimli olarak odemeniz gereken tutar : " + (listeFiyati*adet*0.9));
            }
        }

    }
}
