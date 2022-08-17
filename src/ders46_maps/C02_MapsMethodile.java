package ders46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodile {

    public static void main(String[] args) {
        Map<Integer, String> ogrencimap = ReusableMethods.mapolustur();
        //System.out.println(ogrencimap);

// value'lari sira numarali olarak yazdiralim

        ReusableMethods.tumvalueSiraliyazdir(ogrencimap);
// isim ve soyisimlerin birlikte olacagi bir liste olustturun


        List<String> isimsoyisimlist = ReusableMethods.isimsoyisimlistesiolustur(ogrencimap);

        System.out.println(isimsoyisimlist);
// kac farkli brans varsa brans ismii : brastaki ogrenci sayisi
        //seklinde yazdirin

    }

}
