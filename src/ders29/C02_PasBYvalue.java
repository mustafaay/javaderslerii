package ders29;

import java.util.Arrays;
import java.util.Random;

public class C02_PasBYvalue {

    public static void main(String[] args) {

       /*
       verilen 4 elemanli bir arrayi
       ,ethoda gondereleim
       methodda yeni 3 elemanli bir array atayim
       bu arraye rast gele den kucun
         3 sayi atayalim
         methodda array'i yazdiralim

         main methoddada method calldan sonra methodu yazdiralim
        */


        int[] arr = {3, 5, 8, 10};
        arrayidegistirme(arr);


        System.out.println(Arrays.toString(arr) + "main methoddada");


    }

    public static void arrayidegistirme(int[] arr) {

        Random rand = new Random();
        arr = new int[3];
        arr[0] = rand.nextInt(100);
        arr[1] = rand.nextInt(100);
        arr[2] = rand.nextInt(100);


        System.out.println(Arrays.toString(arr));


    }
}
