package week04;

import java.util.Scanner;

public class P03_forLoop {
    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        // dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        // baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir baslangic degeri giriniz : ");
        int baslangicDegeri = scan.nextInt();
        System.out.print("Bir bitis degeri giriniz : ");
        int bitisDegeri = scan.nextInt();
        int toplam = 0;

        if (bitisDegeri < baslangicDegeri){
            System.err.println("Baslangic degeri bitis degerinden kucuk olmalidir");
        } else {
            for (int i = baslangicDegeri; i <= bitisDegeri; i++) {
                toplam += i;
            }
            System.out.println("Girilen degerler arasindaki sayilar toplami : " + toplam);
        }
    }
}
