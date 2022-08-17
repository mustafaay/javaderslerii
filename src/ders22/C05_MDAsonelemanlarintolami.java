package ders22;

import java.util.Arrays;

public class C05_MDAsonelemanlarintolami {

    public static void main(String[] args) {

        /*
        Soru 2) Asagidaki multi dimensional
        array’in ic array’lerindeki son
         elemanlarin carpimini  ekrana
          yazdiran bir program yaziniz
           { {1,2,3}, {4,5}, {6} }
         */

        int[][] sayilar = {{1, 2, 3}, {4, 5}, {6}};
        int carpm = 1;


        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                if (j == sayilar[i].length - 1) {


                    carpm *= sayilar[i][j];
                }


            }


        }


        System.out.println(carpm);


    }
}
