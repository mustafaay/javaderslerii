package ders21;

import java.util.Arrays;

public class C01_ArraysMaxSayiyiBulma {

    public static void main(String[] args) {
/*
Soru 1- Verilen bir int array’deki
 en buyuk sayiyi yazdiran bir method olusturun.
 */
int[] sayilar={5,1,3,5,7,8,4,2,6,5,7,1,2,3,5,4,7,8,9};

MaxSayiyiYazdir(sayilar);




    }

    public static void MaxSayiyiYazdir(int[] sayilar) {

       int maxsayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {

            if(sayilar[i]>maxsayi){

                maxsayi=sayilar[i];
                System.out.println("maxt   "+maxsayi);
            }







        }

        System.out.println("maxsayi=  "+ maxsayi);

    }
}
