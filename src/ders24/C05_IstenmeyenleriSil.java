package ders24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {

    public static void main(String[] args) {

// Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin

        String[] sehirler = {"istanbul", "ankara", "konya ", "mersin", "kastamaonu"};

        String istenmeyenharf = "r";

        List<String> kalanlar = new ArrayList<String>();

        for (int i = 0; i < sehirler.length; i++) {
            if (!sehirler[i].contains(istenmeyenharf)) {
                kalanlar.add(sehirler[i]);
            }


        }
       String[] kalanlararray=new String[kalanlar.size()];
        for (int i = 0; i < kalanlararray.length ; i++) {

            kalanlararray[i]=kalanlar.get(i);

        }


        sehirler=kalanlararray;
        System.out.println(Arrays.toString(sehirler));

    }
}
