package week04;

import java.util.Scanner;

public class P05_forLoop {
    public static void main(String[] args) {

        // Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin.

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String str = scan.next();
        String tersStr = "";
        for (int i = str.length(); i >=1 ; i--) {
            tersStr +=str.substring(i - 1, i);

        }
        str = tersStr;
        System.out.println("Girilen kelimenin tersi : " + tersStr);

    }
}
