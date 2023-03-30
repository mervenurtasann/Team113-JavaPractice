package week03;

import java.util.Scanner;

public class P06_Ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
            1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
            "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.
         */
        // System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz :  (her girisinizde lutfen enter tusuna basiniz)");
        // System.out.println("1.kenar uzunlugu : ");
        // int kenar1 = scan.nextInt();
        // System.out.println("2.kenar uzunlugu : ");
        // int kenar2 = scan.nextInt();
        // System.out.println("3.kenar uzunlugu : ");
        // int kenar3 = scan.nextInt();
        // System.out.println(kenar1 > 0 && kenar2 >0 && kenar3 > 0
        //         ?
        //         (kenar1 == kenar2 && kenar1 == kenar3 ? "Eskenar ucgen" : "Eskenar ucgen degil")
        //         : "Yanlis giris yaptiniz");

        /*
            2- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
harf        olarak yazdirin, yoksa girilen harfi yazdirin
         */
        // System.out.println("Lutfen bir harf giriniz : ");
        // char harf = scan.next().charAt(0);
        // System.out.println((harf >= 97 && harf <= 122) ? (char) (harf - 32) : harf);
        // System.out.println((harf >= 'a' && harf <= 'z' ? (char)(harf - 32): harf));
        // System.out.println(harf >= 'a' && harf <= 'z' ? Character.toUpperCase(harf) : harf);
        // char harf = scan.next().toUpperCase().charAt(0);
        // System.out.println("harf = " + harf);

        /*
            3- Kullanicidan 2 adet sayi isteyin ve büyük olmayan sayiyi yazdirin
         */

       // System.out.println("Lutfen iki sayi girin : ");
       // System.out.println("1.sayi : ");
       // double sayi1 = scan.nextDouble();

       // System.out.println("2.sayi : ");
       // double sayi2 = scan.nextDouble();

       // System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);

        /*
            4- Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
            kucukse "Maalesef kaldin" yazdirin.
         */

        System.out.println("Lutfen notunuzu giriniz :");
        double not = scan.nextDouble();
        System.out.println(not >= 50 ? "Sinifi " + not + " ortalamasi ile gectiniz" : "Maalesef " + not + " ortalama ile kaldiniz");


    }
}
