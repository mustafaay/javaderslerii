package ders16;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        //Soru 10 ) Kullanicidan iki sayi isteyin.
        // Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        // sonucu yazdiran bir method  yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen baslangic  sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen bitis sayiyi giriniz ");
        int sayi2 = scan.nextInt();


        aralaritopla(sayi1, sayi2);

    }

    public static void aralaritopla(int sayi1, int sayi2) {

        int toplam = 0;

        if (sayi1 < sayi2) {

            for (int i = sayi1; i <= sayi2; i++) {

                toplam += i;


            }
        } else if (sayi2 < sayi1) {

            for (int i = sayi2; i <= sayi1; i++) {

                toplam += i;


            }


        } else {
            System.out.println("baslangic ve bitis ayni olamaz");
        }

        System.out.println(toplam);


    }
}
