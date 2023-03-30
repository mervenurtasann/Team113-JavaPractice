package week03;

import java.util.Scanner;

public class P07_SwitchStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
            1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin
         */

       // System.out.print("Lutfen bir rakam giriniz(0-9) : ");
       // int rakam = scan.nextInt();

       // switch (rakam){
       //     case 0 :
       //         System.out.println("Sifir");
       //         break;
       //     case 1 :
       //         System.out.println("Bir");
       //         break;
       //     case 2 :
       //         System.out.println("Iki");
       //         break;
       //     case 3 :
       //         System.out.println("Uc");
       //         break;
       //     case 4 :
       //         System.out.println("Dort");
       //         break;
       //     case 5 :
       //         System.out.println("Bes");
       //         break;
       //     case 6 :
       //         System.out.println("Alti");
       //         break;
       //     case 7 :
       //         System.out.println("Yedi");
       //         break;
       //     case 8 :
       //         System.out.println("Sekiz");
       //         break;
       //     case 9 :
       //         System.out.println("Dokuz");
       //         break;
       //     default:
       //         System.out.println("Rakam 0-9 arasinda olmalidir.Yanlis deger girdiniz");
        // }


        /*
            2- Kullanicidan ay numarasini alip ay ismini yazdirin
         */

     // System.out.println("Lutfen adini merak ettiginiz ayin numarasini giriniz : ");
     // int ay = scan.nextInt();
     // switch (ay){
     //     case 1 :
     //         System.out.println("Ocak"); break;
     //     case 2 :
     //         System.out.println("Subat"); break;
     //     case 3 :
     //         System.out.println("Mart"); break;
     //     case 4 :
     //         System.out.println("Nisan"); break;
     //     case 5 :
     //         System.out.println("Mayis"); break;
     //     case 6 :
     //         System.out.println("Haziran"); break;
     //     case 7 :
     //         System.out.println("Temmuz"); break;
     //     case 8 :
     //         System.out.println("Agustos"); break;
     //     case 9 :
     //         System.out.println("Eylul"); break;
     //     case 10 :
     //         System.out.println("Ekim"); break;
     //     case 11 :
     //         System.out.println("Kasim"); break;
     //     case 12 :
     //         System.out.println("Aralik"); break;
     //     default:
     //         System.out.println("Miladi takvimde de 12 ay vardir.Gecersiz bir deger giriniz.");
     // }

      /*
         3- Kullanicidan ay numarasini alip mevsimi yazdirin
      */
      //  System.out.print("Lutfen mevsimini ogrenmek istediginiz ayin numarasini giriniz : ");
      //  int ayNo = scan.nextInt();
      //
      //  switch (ayNo){
      //      case 12 : case 1 : case 2:
      //          System.out.println("Kis");break;
      //      case 3 : case 4 : case 5 :
      //          System.out.println("Ilkbahar");break;
      //      case 6 : case 7 : case 8 :
      //          System.out.println("Yaz"); break;
      //      case 9 : case 10 : case 11 :
      //          System.out.println("Sonbahar");break;
      //      default:
      //          System.out.println("Miladi takvimde de 12 ay vardir.Gecersiz bir deger giriniz.");
      //  }

        /*
            4- Kullanıcıdan yılı ve ay numarasını alıp o yıldaki o ayda kaç gün olduğunu yazdırın
         */
        System.out.println("Bilgi istediginiz yili giriniz : ");
        int year = scan.nextInt();
        System.out.println("Gun sayisini merak ettiginiz ayin kacinci ay oldugunu giriniz : ");
        int ayNo = scan.nextInt();


        int numdays = 0;
        switch (ayNo){
            case 1 : case 3 : case 5: case 7 : case 8 : case 10 : case 12 :
                numdays = 31; break;
            case 4 : case 6 : case 9 : case 11 :
                numdays = 30; break;
            case 2 :
                numdays =((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28) ; break;
            default:
                System.out.println("Gecersiz ay");
        }
        System.out.println(numdays);
    }
}
