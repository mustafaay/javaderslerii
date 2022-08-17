package ders18;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        /*
        kulanicidan tam sayilar alin
        kyulanici cift sayi girdigi mudetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        /*
        while loop ile
         */

        Scanner scan = new Scanner(System.in);

        int sayi = 0;

        /*
        loopl larda kulanacagimiz degiskenleri looptan once olusturmaliyiz
        while loopta looptan once olusturdugumuz bu degiskene atayacagimiz degeri iyi dusunmemiz gerekiyor

         */
        //while ile yapalim
        while (sayi % 2 == 0) {


            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            System.out.println(sayi);


        }
        sayi = 0;

        System.out.println(" hhhhhhhhhhhhhhhhhhhhhh    ");









        // do while loop ile yapalim;
        // do while'loop'da onceden olusturulan variable'a hangi deger atandiginin
        // hic bir onemi yok, kodumuz her durumda calisir
        /*
          do-while'in dezavantaji :
          ilk calistirma kontrol yapilmadan oldugu icin
          loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */

        do {
            System.out.println("lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if(sayi%2==0){

                System.out.println("sayi cift");


            }

            else {
                System.out.println("sayi tek");
            }



        } while (sayi % 2 == 0);


    }
}
