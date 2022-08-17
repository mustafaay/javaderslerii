package ders47_maps;

import ders46_maps.ReusableMethods;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class C03_UpdateJava {

    public static void main(String[] args) {


     /*
          map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
          map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini doner
          ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak
                      map uzerinde manipulation yapmamiz lazim
           map.get(key) ==> verilen key'e ait degeri dondurur
         */
        Map<Integer, String> sinifListMap = ReusableMethods.mapolustur();
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false
        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisikliklerde kullanamayiz
        //ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        ReusableMethods.tumvalueSiraliyazdir(sinifListMap);
        // map'i gunceleme yapmak icin key, yeni degeri mape eklemeliyiz
        // ornegin key 101 icin value ali, can, jdev
        //gunceleme icin sinifListMap.put.(101,ali, can ,javadeveloper)

        // bbunu yapabilmek icin her bir keye ve ona ait value ihtiyacimiz var
        Set<Integer> keyseti = sinifListMap.keySet();
        String value;
        for (Integer e : keyseti) {

            value = sinifListMap.get(e);
            value = value.replace("jdev", "java devoloper");
            sinifListMap.put(e, value);
/*
biz key'lerin tamamini aldik
her bir key'in valusunu
getirdik
valu uzerinden degisikligi yapip yeni halini put (key,yenideger)ile map'e koyduk
 */


        }
        System.out.println(sinifListMap);


    }
}
