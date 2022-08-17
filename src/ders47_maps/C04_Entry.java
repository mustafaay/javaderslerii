package ders47_maps;

import ders46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {

    public static void main(String[] args) {
/*
java ENTRY<K,V/> map'in icerisinde bulunan her bur kaydi
k=v seklinde tutat dolayisiyla
herhangi bir entry'ye ulastigimizda gem key'e hemde valu'ya ulasabilir ve istedugumuz islemleri yapabiliriz
entry.getKey() bize key'i getirir
entry.getvalue() bize value'yi getirir
entry.setValue valu'yu istedigimiz deger ilarak update eder
 */
       Map<Integer,String> siniflistmap= ReusableMethods.mapolustur();
        System.out.println(siniflistmap);

        /*
        her bir elemani alt alta yazdirin
         */

Set<Map.Entry<Integer,String>> sinifentryset= siniflistmap.entrySet();

        for (Map.Entry e:sinifentryset) {
            System.out.println(e);
        }
// map icerisindeki tester kurs ismini qa olarak degistirelim
String str;
        for (Map.Entry<Integer,String> e:sinifentryset) {


          str=e.getValue();
          str=str.replace("tester","QA");
            e.setValue(str);

        }
        System.out.println(siniflistmap);
    }
}
