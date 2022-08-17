package ders20;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {


        int sayilar[] = new int[3];
        sayilar[0] = 7;
        sayilar[2] = 8;
        sayilar[1] = 9;

        System.out.println((sayilar[0]  + sayilar[1]) + " " + sayilar[2] + " ");


        System.out.println(Arrays.toString(sayilar));

String sinflist[]={"mustafa", "ali","aysee","ahmet"};

        System.out.println(Arrays.toString(sinflist));

    }
}
