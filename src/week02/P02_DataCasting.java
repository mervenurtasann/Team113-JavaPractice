package week02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {
        /*
      1-Int olarak verilen 3 sayının toplamını double olarak yazdırın
      ipucu: double>float>long>int>short>byte
        */

        int a=3, b=9, c=7;
        int total=(a+b+c);
        System.out.println("total = " +(double)total);


         /*
        2- Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter : ");
        char letter = scan.next().charAt(0);
        System.out.println("Entered letter : " + letter);
        System.out.println("3 letters after the letter you entered : " +
                           (char) (letter + 1) + ", " +
                           (char) (letter + 2) + ", " +
                           (char) (letter + 3) );

         /*
        3- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        sonucu tam sayı yazdırın
        ipucu: sorumluluk bende
         */

        System.out.println("Enter two decimal numbers : ");
        double number1 = scan.nextDouble();
        double number2= scan.nextDouble();
        int total2=(int)(number1/number2);
        System.out.println(total2);


    }
}
