package ders47_maps;

import java.util.HashMap;
import java.util.Map;

public class C02_Tekrarsayisibulma {

    public static void main(String[] args) {
        /*
        verilen bir String'teki kulanilan harfleri
        ve kulanilen harfleri tekrar sayisini
        H=20 ; seklinde yazdirin

         */
        String str = "Heeeeellllooooo Woooorrrrllllllddddd";
// bosluklari saymamasi icin once onlari yok edelim
        str = str.replaceAll("\\W", "");

        String[] harflerarr = str.split("");
        int temp = 0;

        Map<String, Integer> harfkulanimsayimapi = new HashMap<String, Integer>();
        for (String a : harflerarr) {

            if (!harfkulanimsayimapi.containsKey(a)) {

                harfkulanimsayimapi.put(a, 1);


            } else {
                temp = harfkulanimsayimapi.get(a);
                harfkulanimsayimapi.put(a, temp + 1);

            }


        }
        System.out.println(harfkulanimsayimapi);


    }
}
