package week01;

public class P02_dataTypes {
    public static void main(String[] args) {
        /*
        byte    : sadece tam sayi degeri alir 8bit
        short   : sadece tam sayi degeri alir 16 bit
        int     : sadece tam sayi degeri alir 32bit
        long    : sadece tam sayi degeri alir 64bit

        float   : ondalikli sayi degerleri alir -sonuna f zorunlu
        double  : ondalikli sayi degerleri alir -sonuna d koyulabilir
        double>float>long>int>short>byte

        boolean : true ya da false verir
        char    : tek tirnak icinde tek karakter- tirnak icinde olmadan sayi(ASCII)

         */

        byte b1 = Byte.MAX_VALUE;
        System.out.println("b1 = " + b1);
        
        long l1 = Long.MIN_VALUE;
        System.out.println("l1 = " + l1); // soutv kisa komutu degerle yazdirir
    }
}
