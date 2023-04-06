package week09;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userChoice = 0;
        int sonuc = 0;

        while (userChoice != 5) {
            // Giris menusunu yazdiralim
            System.out.println("Lutfen yapmak istediginiz islemi seciniz : ");
            System.out.println("1- Toplama");
            System.out.println("2- Cikarma");
            System.out.println("3- Carpma");
            System.out.println("4- Bolme");
            System.out.println("5- Cikis");
            userChoice = input.nextInt();

            if (userChoice >= 1 && userChoice <= 4) {
                System.out.println("Lutfen iki sayi giriniz : ");
                System.out.print("Birinci sayi : ");
                int sayi1 = input.nextInt();
                System.out.print("Ikinci sayi : ");
                int sayi2 = input.nextInt();
                if (userChoice == 1) {
                    sonuc = sayi1 + sayi2;
                }
                if (userChoice == 2) {
                    sonuc = sayi1 - sayi2;
                }
                if (userChoice == 3) {
                    sonuc = sayi1 * sayi2;
                }
                if (userChoice == 4) {
                    sonuc = sayi1 / sayi2;
                }
                System.out.println("İslem sonucu : " + sonuc);
            }
        }
    }
}
