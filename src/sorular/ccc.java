package sorular;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ccc {
    public static void main(String[] args) {
        /*
        Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.

LinkedList elemanları: sari,mavi,mor,yesil,beyaz

Beklenen Çıktı:
sari
mavi
mor
yesil
beyaz
         */

        LinkedList<String> str=new LinkedList<String>();


       str.add("sari");
       str.add("mavi");
       str.add("mor");
       str.add("yesil");
       str.add("beyaz");

        for (int i = 0; i < str.size(); i++) {

            System.out.println(str.get(i));


        }









    }
}
