package ders21;

import java.util.Arrays;

public class C10_Siplit {

    public static void main(String[] args) {

        /*
        Siplit methodu bir array methodu degil String methodudur
        ama array dondurdugu icin bu konuda anlatiyoruz

        siplit() ile herhngi bir stringi istedigimiz sekilde parcalara bolup
        array olarak yaziyoruz
         */

        String str="java ne kadar guzel ";
String []kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[java, ne, kadar, guzel]


        String []kelimelerne=str.split("");
        System.out.println(Arrays.toString(kelimelerne));//[j, a, v, a,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l,  ]








    }
}
