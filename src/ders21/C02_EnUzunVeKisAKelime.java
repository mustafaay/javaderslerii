package ders21;

import java.util.Scanner;

public class C02_EnUzunVeKisAKelime {

    public static void main(String[] args) {
        /*
        Soru 2- Verilen String bir array’de
         en uzun ve en kisa String’leri yazdiran
         bir method olusturun
         */

        String[] kelimeleer = {"erdal", "mustafa", "alse", "hayrullah", "mijrican"};
        enuzunvekisayiyazdir(kelimeleer);


    }

    public static void enuzunvekisayiyazdir(String[] kelimeleer) {
        String enuzunkelime = kelimeleer[0];
        String enkisakelime = kelimeleer[0];
        for (int i = 1; i < kelimeleer.length; i++) {

            if (kelimeleer[i].length() > enuzunkelime.length()) {
                enuzunkelime = kelimeleer[i];
            }

            if (kelimeleer[i].length() < enkisakelime.length()) {
                enkisakelime = kelimeleer[i];
            }


        }
        System.out.println("en uzun kelime = = " + enuzunkelime);
        System.out.println("en kisa kelime = = " + enkisakelime);

    }
}
