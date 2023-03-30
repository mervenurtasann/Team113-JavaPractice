package week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class F01SayiTahminOyunu {

        /*
            Sisteme bir sayi tanimlayip, kullanicidan sayi isteyerek
            bu sayi fazla ise Cok soyledin dusur, az ise Dusuk soyledin arttir.
            bilince de tebrik edip durduran bir kod yazalim
        */

    public static void main(String[] args) {
        int sayi = 94;
        System.out.println("Aklimdan 0-100 arasi bir tam sayi tuttum. Hadi tahmin et!");
        Scanner scan = new Scanner(System.in);
        List<Integer> tahminler = new ArrayList<>();
        boolean dogruMu = false;
        while (!dogruMu) {  // -e kadar
            int tahmin = scan.nextInt();
            tahminler.add(tahmin);
            if (tahmin > sayi) {
                System.out.println("Cok soyledin, azalt!");
            } else if (tahmin < sayi) {
                System.out.println("Az soyledin, arttır!");
            } else if (tahmin == sayi) {
                System.out.println("Tebrikler! Dogru bildiniz");
                System.out.println("Tahminleriniz : " + tahminler);
                dogruMu = true;
            } else {
                dogruMu = false;
            }
        }
    }
}
