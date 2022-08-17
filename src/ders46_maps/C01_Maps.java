package ders46_maps;

import java.lang.reflect.Array;
import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        Map<Integer, String> siniflist = new HashMap<>();

        siniflist.put(101, "ali , can , jdev");
        siniflist.put(102, "enes , cem , tester");
        siniflist.put(103, "taha , emre , java");
        siniflist.put(104, "derya , deniz , tester");

        System.out.println(siniflist);
//{101=ali , can , jdev, 102=enes , cem , tester, 103=taha , emre , java, 104=derya , deniz , tester}

        System.out.println(siniflist.keySet());//[101, 102, 103, 104]
        System.out.println(siniflist.values());//[ali , can , jdev, enes , cem , tester, taha , emre , java, derya , deniz , tester]
        System.out.println(siniflist.values().size());//4
        /*
        tum ogrencilerin bilgilerinini alt alta yazdiralim
         */

        Collection<String> tumvaluecolettions = siniflist.values();
        String[] herbireleman;
        int sira = 1;
        for (String s : tumvaluecolettions) {

            herbireleman = s.split(" , ");
            System.out.println(sira + " - " + herbireleman[0] + "   " + herbireleman[1]);
            sira++;
            /*
            buradaki each bize her bir
            ogernciye ait
            ayni yapidaki isim , soiyim , brans bilgilerini iceren String'ler getiriyor
             */
        }
/*
map'te bulunan ogrencilerin isim ve
soy isimlerini birlestirerek bir sinif listesi olusturun

 */

        List<String> sinifisim=new ArrayList<String>();
        for (String s :tumvaluecolettions
             ) {
            herbireleman=s.split(" , ");
            sinifisim.add(herbireleman[0]+"   "+herbireleman[1]);


        }
        System.out.println(sinifisim);











    }
}
