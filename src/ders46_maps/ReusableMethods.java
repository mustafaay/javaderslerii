package ders46_maps;

import java.util.*;

public class ReusableMethods {

    public static Map<Integer, String> mapolustur() {


        Map<Integer, String> siniflist = new HashMap<>();

        siniflist.put(101, "ali , can , jdev");
        siniflist.put(102, "enes , cem , tester");
        siniflist.put(103, "taha , emre , java");
        siniflist.put(104, "derya , deniz , devaps");
        siniflist.put(105, "enes , can , tester");
        siniflist.put(106, "taha , denız , java");
        siniflist.put(107, "derya , cem , tester");


        return siniflist;
    }


    public static void tumvalueSiraliyazdir(Map<Integer, String> ogrencimap) {
        int sira = 1;

        for (String o : ogrencimap.values()) {

            System.out.println(sira + "   " + o);
            sira++;
        }


    }

    public static List<String> isimsoyisimlistesiolustur(Map<Integer, String> ogrencimap) {

        List<String> metoddakilist = new ArrayList<>();
        String[] arr;
        for (String a : ogrencimap.values()

        ) {

            arr = a.split(" , ");
            metoddakilist.add(arr[0] + "   " + arr[1]);


        }


        return metoddakilist;
    }


    public static void Bransogrencisayisiyazdir(Map<Integer, String> siniflistmap) {

        // brans=branstaki ogrenci sayisi
        Map<String, Integer> bransogrsayi = new TreeMap<>();

        Collection<String> valuescolections = siniflistmap.values();
        Integer temp = 0;
        String[] arr;
        String brans;
        for (String s : valuescolections) {

            arr = s.split(" , ");
            brans = arr[2];

            // brans;in bu mapte key olarak dah onceden eklenip eklenmedigini kontrol etmeliyiz
            if (!(bransogrsayi.containsKey(brans))) {
                bransogrsayi.put(brans, 1);


            } else {
                temp = bransogrsayi.get(brans);
                bransogrsayi.put(brans, temp + 1);

            }

        }


        System.out.println(bransogrsayi);


    }

    public static void entryazdirmethod(Map<Integer, String> siniflistmap) {

        Set<Map.Entry<Integer, String>> siniflistentryseti=siniflistmap.entrySet();
        for (Map.Entry<Integer, String> e:siniflistentryseti) {
            System.out.println(e);
        }












    }
}