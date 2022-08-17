package ders24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Arraydanlisteolusturmalar {

    public static void main(String[] args) {

        /* icinde 200 tane 1000 den kucuk pozitiftam sayi olan bir list olusturun
        lulanicidan sayi isteyip listede olup olmadigini kontrol edin
         */
        Random rand = new Random();

        int sayi = 0;
        List<Integer> sayilar = new ArrayList<>();


        while (sayilar.size() < 200) {


            sayi = rand.nextInt(1000);

            if (!(sayilar.contains(sayi))) {


                sayilar.add(sayi);

            }


        }
        System.out.println(sayilar);
        boolean bildinmi = false;
        int tahminsayi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildinmi) {
            System.out.println("lutfen sayi giriniz");

            sayi = scan.nextInt();

            if (sayilar.contains(sayi)) {


                System.out.println(tahminsayi + " kadar denedin " + "tebrikler dogru bildiniz");

                bildinmi = true;
            } else {

                System.out.println(tahminsayi + " adet sayi soylediniz ve tahmininiz yanlis");
                tahminsayi++;


            }


        }


    }
}
