package ders21;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArayaBoyutuDondurme {

    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan
        bir array’in boyutunu ve
         tum elementlerini alarak bir array
          olusturup, bu array’i bize donduren
           bir method olusturun
         */

        int[] sayilar = arayolusturmethod();

        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arayolusturmethod() {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen array uzunlugu giriniz");
        int uzunluk = scan.nextInt();

        int[] olusturulan = new int[uzunluk];


        for (int i = 0; i < uzunluk; i++) {

            System.out.println(i + ". index icin sayi giriniz");
            olusturulan[i] = scan.nextInt();


        }


        return olusturulan;

    }
}
