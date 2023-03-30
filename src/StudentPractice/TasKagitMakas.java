package StudentPractice;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {
    // Bilgisayara karsi tas kagit makas oyunu oynayin
    // 5 puana ilk ulasan oyunu kazanir

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoise = 0;
        int compChoise = 0;
        int user = 0;
        int comp = 0;

        do{
        System.out.println("Asagidakilerden birini sec : \n1- Tas     2- Kagit    3- Makas ");

        // Kullanicinin secim yapmasini istiyoruz
        userChoise = scan.nextInt();

        // Bilgisayarin secim yapmasini saglayalim
        compChoise = random.nextInt(3) + 1;  // burada [0,3) arasinda deger secer. bizde +1 ile 1,2,3'den birini secmesini sagladik

            if (userChoise == 1 && compChoise == 2) {
                System.out.println("Bilgisayarin sectigi : " + compChoise);
                System.out.println("");
                System.out.println("Kagit tasi sarar -- Bilgisayar kazandi");
                comp++;
                System.out.println("Oyuncu : " + user + " Bilgisayar : " + comp);
                System.out.println(" ");
            } else if (userChoise == 1 && compChoise == 3) {
                System.out.println("Bilgisayarin sectigi : " + compChoise);
                System.out.println("");
                System.out.println("Tas makasi kirar -- Oyuncu kazandi");
                user++;
                System.out.println("Oyuncu : " + user + " Bilgisayar : " + comp);
                System.out.println(" ");
            } else if (userChoise == 2 && compChoise == 1) {
                System.out.println("Bilgisayarin sectigi : " + compChoise);
                System.out.println("");
                System.out.println("Kagit tasi sarar -- Oyuncu kazandi");
                user++;
                System.out.println("Oyuncu : " + user + " Bilgisayar : " + comp);
                System.out.println(" ");
            } else if (userChoise == 2 && compChoise == 3) {
                System.out.println("Bilgisayarin sectigi : " + compChoise);
                System.out.println("");
                System.out.println("Makas kagidi keser -- Bilgisayar kazandi");
                comp++;
                System.out.println("Oyuncu : " + user + " Bilgisayar : " + comp);
                System.out.println(" ");
            } else if (userChoise == 3 && compChoise == 1) {
                System.out.println("Bilgisayarin sectigi : " + compChoise);
                System.out.println("");
                System.out.println("Tas makasi kirar -- Oyuncu kazandi");
                comp++;
                System.out.println("Oyuncu : " + user + " Bilgisayar : " + comp);
                System.out.println(" ");
            } else if (userChoise == 3 && compChoise == 2) {
                System.out.println("Bilgisayarin sectigi : " + compChoise);
                System.out.println("");
                System.out.println("Makas kagidi keser -- Bilgisayar kazandi");
                user++;
                System.out.println("Oyuncu : " + user + " Bilgisayar : " + comp);
                System.out.println(" ");
            } else {
                System.out.println("Beraber, kimse puan alamadi");
                System.out.println("Oyuncu : " + user + " Bilgisayar : " + comp);
                System.out.println(" ");
            }

        } while (user != 5 && comp != 5);
        // kazanani gösterelim
        if (user > comp) {
            System.out.println("------Tebrikler Siz Kazandiniz ------");
        } else {
            System.out.println("------ Maalesef Kazanamadiniz ------");
        }
        scan.close();
    }
}
