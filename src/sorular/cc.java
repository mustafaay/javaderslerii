package sorular;

import java.util.ArrayList;
import java.util.List;

public class cc {

    public static void main(String[] args) {

        /*
        Bir ArrayList oluşturum ve önce ArrayListi yazdıralım sonra index numarasına göre tek tek yazdıralım.

ArrayList: siyah,mavi, kirmizi,yesil,mor,turuncu

Beklenen Çıktı:
Orjinal array list: [siyah,mavi,kirmizi,yesil,mor,turuncu]
siyah
mavi
kirmizi
yesil
mor
turuncu
         */

        List<String> liste = new ArrayList<String>();
        liste.add("siyah");
        liste.add("mavi");
        liste.add("kirmizi");
        liste.add("yesil");
        liste.add("mor");
        liste.add("turuncu");

        System.out.println("orjinel list = " + liste);

        for (int i = 0; i < liste.size(); i++) {

            System.out.println(liste.get(i));


        }


    }
}
