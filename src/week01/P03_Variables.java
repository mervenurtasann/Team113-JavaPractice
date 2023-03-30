package week01;

public class P03_Variables {
    public static void main(String[] args) {
        /*
        byte    : sadece tam sayi degeri alir 8bit
        short   : sadece tam sayi degeri alir 16 bit
        int     : sadece tam sayi degeri alir 32bit
        long    : sadece tam sayi degeri alir 64bit

        float   : ondalikli sayi degerleri alir -sonuna f zorunlu
        double  : ondalikli sayi degerleri alir -sonuna d koyulabilir

         */
        byte a1 = 34;
        byte a2 = 127;
        System.out.println("a2 = " + a2);
        System.out.println("a1 = " + a1);

        int a3 = 34;
        int a4 = 129;
        long l1 = 222222222;

        double d1 = 23.57;
        double d2 = 2345678d;
        System.out.println("d2 = " + d2);

        float f1 = 2.34f;
    }
}
