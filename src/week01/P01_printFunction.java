package week01;

public class P01_printFunction {
    public static void main(String[] args) {
        // burasi yorum satiri
        /*
         buraya yorum
         satirlarca
         yazilabilir
         */
        /*
         Soru-1
         Konsola Hello World ve "Hello World"
         yazdiriniz.
         */
        //System.out.println("Hello World");
        //System.out.println("\"Hello World\"");

        /*
         Soru - 2
         Konsola
         "Hello \
         'World' \/"
         yazdiriniz
         */
        /*
          \n    : bir alt satirdan yazmaya baslar
          \t    : bir TAB bosluk birakir
          \"    : " yazar
          \'    : ' yazar
          \\    : \ yazar
          \/    : / yazar
         */
        System.out.println("\"Hello\t\\\n'World'\t\\/\"");

        /*
        Soru - 3
        Deger atayarak
        Tarik Yigit - QA Software Test Engineer
         */
        String name = "Tarik";
        String surname = "Yigit";
        String job = "QA Software Test Engineer";
        System.out.println(name + " " + surname + " - " + job);
        System.out.println("======= KOD BASARIYLA TAMAMLANDI ========");
        System.out.print(name + " ");
        System.out.print(surname + " - ");
        System.out.print(job);
        System.out.println(" ");
        System.out.println("======= PRINTLN FARKI ==========");
        System.out.println(name + " ");
        System.out.println(surname + " - ");
        System.out.println(job);

        /*
        ODEV : Asagidaki gibi bir ATM karsilama ekrani yazan koda dizisini yaziniz.

        ****    WISE BANK   ****
    WISE ATM’YE HOŞGELDİNİZ
    1 – Bakiye Sorgulama
    2 – Para Yatırma
    3 – Para Çekme
    4 – Bilgi Güncelleme
    5 – Kart İade
      ****    WISE BANK   ****
         */

        System.out.println("**********\tWISE BANK\t***********\n"+
                "\tWISE ATM'ye Hosgeldiniz\n"+
                "\t1- Bakiye Sorgulama\n"+
                "\t2- Para Yatirma\n"+
                "\t3- Para Cekme\n"+
                "\t4- Bilgi Guncelleme\n"+
                "\t5- Kart Iade");
    }
}
