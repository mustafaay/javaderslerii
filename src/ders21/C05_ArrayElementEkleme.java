package ders21;

import java.util.Arrays;

public class C05_ArrayElementEkleme {

    public static void main(String[] args) {
/*
Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
 */

        String[] siniflistesi = {"alican"};
        String eklenecekisim = "murat";

        siniflistesi = elemanekle(siniflistesi, eklenecekisim);
        System.out.println(Arrays.toString(siniflistesi));

    }

    public static String[] elemanekle(String[] siniflistesi, String eklenecekisim) {
        String[] yeniliste = new String[siniflistesi.length + 1];
        for (int i = 0; i < siniflistesi.length; i++) {

            yeniliste[i] = siniflistesi[i];


        }

        yeniliste[yeniliste.length - 1] = eklenecekisim;


        return yeniliste;
    }
}
