package week08;

import java.util.Arrays;

public class P02_Arrays {
    /*
        Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        method yaziniz.
     */
    public static void main(String[] args) {
        int[] arr = {2, 10, 5, 3, 6, 9, 20, 35, -5, -3, -15};
        System.out.println(arraydekiPozitifSayilariTopla(arr));
        // sonuc array olarak donuyorsa Arrays.toString ile yazdiririrz.
        // sonuc int vb. donuyorsa direk yazdiririz
    }

    private static int arraydekiPozitifSayilariTopla(int[] arr) {
        int sonuc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sonuc += arr[i];
            }
        }
        return sonuc;

    }
}
