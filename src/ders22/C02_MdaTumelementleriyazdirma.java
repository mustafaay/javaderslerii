package ders22;

import java.util.Arrays;

public class C02_MdaTumelementleriyazdirma {

    public static void main(String[] args) {

        /*
        verilen bir multi dimabinol arrayin tum elementlerini yazdirian bir method hazirlayalim
         */

        int[][] sayilar = {{1, 5, 6, 9}, {2, 5}, {3, 1, 6}};

        sayilariyazdir(sayilar);


    }

    public static void sayilariyazdir(int[][] sayilar) {

        for (int i = 0; i <= sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {
                System.out.println(sayilar[i][j] );


            }


        }


    }
}
