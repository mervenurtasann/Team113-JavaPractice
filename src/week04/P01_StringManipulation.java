package week04;

import java.util.Scanner;

public class P01_StringManipulation {
    public static void main(String[] args) {
        String str1 = "Emre Can";
        String str2 ="Emre Can";
        String str3 = new String("Emre Can");

        // System.out.println(str1.charAt(0));

       Scanner scan = new Scanner(System.in);
       // System.out.println("Lutfen adinizi giriniz : ");
       // String isim = scan.nextLine();
        String str11 = "Ali";
        String str12 = "ali";
        // System.out.println(str11.equals(str12));
        // System.out.println(str11.equalsIgnoreCase(str12));
        // System.out.println(str1.length()); // length 1'den baslar bosluk dahil sayar
        // System.out.println(str1.length() - 1);

       // System.out.println(str2.substring(1,6));
       // System.out.println(str2.substring(4));
       // System.out.println(str2.substring(8));
       // int sayi =01;

       // System.out.println(str1.concat("_01"));
       // // System.out.println(str2.substring(42));

       // String name3 = "ÇekoslavakyalılaştıramadıklarımızdanMısınız";

       // System.out.println(name3.substring(42));

        String login = "Uye Girisi";
        System.out.println(login.contains("Uye"));

        System.out.println(login.startsWith("U"));
        System.out.println(login.contains("U"));
        System.out.println(login.endsWith("i"));
        System.out.println(login.indexOf("i"));
        System.out.println(login.lastIndexOf('i'));
        System.out.println(str1.isEmpty());

        /*
        \\s : space
        \\S : space olmayan her şey
        \\s+ : yan yana olan birden fazla space
        \\d : digit
        \\D : digit olmayan her şey
        \\w : harf veya rakam
        \\W : harf veya rakam olmayan her şey
         */
        String marka = "Wise3@*9 Quarter";
        marka = marka.replaceAll("\\d","");
        marka = marka.replaceAll("\\W","");
        System.out.println(marka);

        // Kullanicidan bir cumle alin
        //    - cumlede ev geciyorsa, "home home sweet home" yazdirin
        //    - cumlede is geciyorsa, "calismak guzeldir"
        //    - ikisini de iceriyorsa "Hem ev lazim hem is"
        //    - hicbirini icermiyorsa "cok calisman lazim" yazdirin.

        System.out.println("Lutfen cumle giriniz : ");
        String cumle = scan.nextLine();
        String kucukCumle = cumle.toLowerCase();

        if (kucukCumle.contains("ev")&& kucukCumle.contains("is")){
            System.out.println("hem ev lazim hem is");
        } else if (kucukCumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (kucukCumle.contains("ev")) {
            System.out.println("home home sweet home");
        }else {
            System.out.println("cok calisman lazim");
        }
        // Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        //duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        //basariyla kaydedildi" yazdirin
        //    - ilk harf kucuk harf olmali
        //    - son karakter rakam olmali
        //    - sifre bosluk icermemeli
        //    - uzunlugu en az 10 karakter olmali
    }
}
