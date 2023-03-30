package week02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {
        /*
         1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirni alıp
         sisteme kaydedildiğini aşağıdaki formatta yazdırın.
         *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com.tr
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scan.nextLine();

        System.out.println("Enter your surname : ");
        String surname = scan.nextLine();

        System.out.println("enter your age : ");
        int age = scan.nextInt();

        System.out.println("Enter your mail adress : ");
        String email = scan.next();

        System.out.println("Enter your password : ");
        String password = scan.next();

        System.out.println("*****\tKAYIT BASARILI\t*****");
        System.out.println("Name : " + name +
                "\nSurname : " + surname +
                "\nAge : " + age +
                "\nMail Adress : " + email +
                "\nPassword : " + password);
        System.out.println("====================================");

        /*
          Yukarida aldiginiz bilgileri
          Kullanici : T.Yigit, 42
          seklinde yazdirin
         */

        System.out.println("Kullanici : " + name.charAt(0) + "." + surname + ", " + age );

        /*
        2- Kullanicidan ucgenin kenarini ve o kenarin yuksekligini girmesini isteyerek
        ucgenin alanini hesaplayip yazdirin
         */

        int a = 100, h = 120;
        System.out.println("Ucgenin alani : " + ((a * h ) / 2));

        /*
        3- Kullanicidan iki sayi alip ucuncu bir degisken kullanmadan sayi degerlerini
        degistirin(Swap)
         */

        System.out.println("Lutfen iki adet sayi giriniz : ");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("1.sayi olarak : " + sayi1 + " girdiniz" +
                "\n2.sayi olarak : " + sayi2 + " girdiniz");
        System.out.println("-------- Hokus pokus -------");
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2; // sayi2 sayi1'in ilk girilen degerini aldi.
        sayi1 = sayi1 - sayi2;
        System.out.println(" Sayi-1 : " + sayi1 + " Sayi-2 : " + sayi2);




    }
}
