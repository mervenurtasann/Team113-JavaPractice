package week04;

import java.util.Scanner;

public class P07_forLoop {
    public static void main(String[] args) {
        //verilen bir pozitif tam sayinin
        //pozitif tam bolenleriniz yazdiralim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir pozitif tamsayi giriniz : ");
        int sayi = scan.nextInt();
        if (sayi <= 0) {
            System.out.println("Yanlis giris");
        }else {
            for (int i = 1; i <= sayi ; i++) {
                if (sayi % i == 0){
                    System.out.println(i + " ");
                }
            }
        }
    }
}
