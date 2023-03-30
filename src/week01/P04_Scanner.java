package week01;

import java.util.Scanner;

public class P04_Scanner {
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

        System.out.println("Enter your age : ");
        int age = scan.nextInt();

        System.out.println("Enter your mail adress : ");
        String mailAdress = scan.next();

        System.out.println("Enter your password : ");
        String password = scan.next();


        System.out.println("*****\tKAYIT BASARILI\t*****");
        System.out.println("Name : " + name +
                "\nSurname : " + surname +
                "\nAge : " + age +
                "\nMail Adress : " + mailAdress +
                "\nPassword : " + password);
    }
}
