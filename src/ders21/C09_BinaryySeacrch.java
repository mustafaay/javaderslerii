package ders21;

import java.util.Arrays;

public class C09_BinaryySeacrch {

    public static void main(String[] args) {

        /*
        binary  search metodu siralanmis arrayda aradigimiz
        elementin indexsini dondueur

        (String de indexof bize olmayan elementler icin -1 dondurur)
        eger aradimiz sey arrayda yoksa ?
eger o sayi olsaydi nerede olacgini soyler




varsa indext yoksa - sira
         */
        int[] sayilar = {-5,3, 5, 1, 4, 7, 0};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.binarySearch(sayilar, 5));//4
        System.out.println(Arrays.binarySearch(sayilar, -5));//0
        System.out.println(Arrays.binarySearch(sayilar, -88));//-1
        System.out.println(Arrays.binarySearch(sayilar, 2));// eger 2 olsaydi indexi 3 olurdu bu yuzden -3 dondurur


    }
}
