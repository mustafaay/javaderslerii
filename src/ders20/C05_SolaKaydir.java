package ders20;

import java.util.Arrays;

public class C05_SolaKaydir {

    public static void main(String[] args) {

        /*
        Soru 1: Verilen 3 elemanli bir array’in
         tum elemanlarini bir soldaki konuma tasiyacak
          bir program yazin.
          Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
         */

int sayilar[]={5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};

int temp=sayilar[0];
        for (int i = 0; i < sayilar.length-1 ; i++) {


            sayilar[i] = sayilar[i+1];




        }
        sayilar[sayilar.length-1]=temp;
        System.out.println(Arrays.toString(sayilar));

//yukarida degistirdigimiz araayi ilk durumuna getirmek icn


       temp=sayilar[sayilar.length-1];


        for (int i = sayilar.length-1; i >0 ; i--) {


            sayilar[i] = sayilar[i-1];




        }
        sayilar[0]=temp;
        System.out.println(Arrays.toString(sayilar));




    }
}
