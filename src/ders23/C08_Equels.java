package ders23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_Equels {

    public static void main(String[] args) {



        List<String> urunler=new ArrayList<String>();

        urunler.add("nuttella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");



        List<String> urunler2=new ArrayList<String>();
        urunler2.add("cekirdek");
        urunler2.add("nuttella");
        urunler2.add("cay");
        urunler2.add("ikram");

        System.out.println(urunler.equals(urunler2));

Collections.sort(urunler);
Collections.sort(urunler2);


        System.out.println(urunler.equals(urunler2));



    }
}
