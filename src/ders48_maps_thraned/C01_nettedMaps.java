package ders48_maps_thraned;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_nettedMaps {


    public static void main(String[] args) {

        /*
        eger bir elemente ile ilgili tutacagimi bilgiler coksa
        veya copleks ise
        bu defa ic ice map kulanmayi tercih edebiliriz

         ic ice map  kulandigimizda daha fazla datayi daha duzeli
         olarak tutma imkanimiz olur ancak
         bilgiye ulasmak ve manipule etmek zorlasacaktir


orn olarak dunku mapimizi maplerden olusan bir map olarak olusturalim

 siniflist.put(102, "enes , cem , tester");
        siniflist.put(103, "taha , emre , java");
        siniflist.put(104, "derya , deniz , devaps");
         */
Map<String,String> ogre101=new HashMap<>();
ogre101.put("isim","enes");
ogre101.put("soyisim","cem");
ogre101.put("brans","tester");

        Map<String,String> ogre102=new HashMap<>();
        ogre102.put("isim","taha");
        ogre102.put("soyisim","emre");
        ogre102.put("brans","javadev");

        Map<String,String> ogre103=new HashMap<>();
        ogre103.put("isim","derya");
        ogre103.put("soyisim","deniz");
        ogre103.put("brans","devops");
Map<Integer,Map<String,String>> ogrencinestedmap=new HashMap<>();

ogrencinestedmap.put(101,ogre101);
ogrencinestedmap.put(102,ogre102);
ogrencinestedmap.put(103,ogre103);

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrencinestedmap.entrySet();


        for (Map.Entry e:ogrenciEntrySeti) {
            System.out.println(e);


        }


        //102 nolu kisinin ismini yazdiralim
        System.out.println(ogrencinestedmap.get(102).get("isim"));


    }
}
