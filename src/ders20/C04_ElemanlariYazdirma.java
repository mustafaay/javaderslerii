package ders20;

import java.util.Arrays;

public class C04_ElemanlariYazdirma {

    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};

        //arayin tamamini yazdiralim
        System.out.println(Arrays.toString(sayilar));


        //tek tek yazdirmak istersek

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(sayilar[i]);
        }









    }
}
