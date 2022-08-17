package sorular;

import java.util.LinkedList;

public class dd {

    public static void main(String[] args) {
        /*
        bir LinkedList oluşturalım ve Iterator methodunu kullanarak listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.

LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu

elemandan itibaren yazdıralım.
Beklenen Çıktı:
beyaz
mavi
yesil
turuncu
         */


        LinkedList<String> list = new LinkedList<String>();
        list.add("sari");
        list.add("beyaz");
        list.add("mavi");
        list.add("yesil");
        list.add("turuncu");

        int baslangic = 1;

        for (int i = baslangic; i < list.size(); i++) {

            System.out.println(list.get(i));


        }


    }
}
