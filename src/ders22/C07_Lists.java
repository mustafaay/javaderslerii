package ders22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_Lists {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        /*
        list primitive data turlerini kabul etmez
         */
        sayilar.add(5);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(1);
        sayilar.add(7);
        sayilar.add(8);
        sayilar.add(9);
        Collections.sort(sayilar);
        System.out.println(sayilar);

        // sadece add kulanirsak java sona ekler


sayilar.add(2,10);

        System.out.println(sayilar.get(4));

// add(inxt,element) istedigimiz indexteki yere istedigimix elementi ekler
        //digerlerini bir yyana kaydirir

    }
}
