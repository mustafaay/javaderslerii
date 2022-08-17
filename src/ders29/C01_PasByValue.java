package ders29;

import java.util.Arrays;
import java.util.Random;

public class C01_PasByValue {

    public static void main(String[] args) {
        /*
        4 elemanli bir array olusturalim
        sonra ayri bir methodda bu arrayin 2. ve 4.
        elemanalarini 100 den kucuk ras gele
        bir sayi ile degistirelim ve yeni halini
     yazdıralım
         */
        int[]arr={5,7,8,10};







        arraydegistir(arr);


        System.out.println(Arrays.toString(arr));









    }

    public static void arraydegistir(int[] arr) {
        Random rand = new Random();
        arr[1]= rand.nextInt(100);
arr[3]= rand.nextInt(100);

        System.out.println(Arrays.toString(arr));




    }
}
