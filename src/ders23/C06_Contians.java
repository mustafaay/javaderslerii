package ders23;

import java.util.ArrayList;
import java.util.List;

public class C06_Contians {

    public static void main(String[] args) {

        List<String> urunler=new ArrayList<String>();

        urunler.add("nuttella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        System.out.println( urunler.contains("nuttella"));


        List<String> urunler2=new ArrayList<String>();

        urunler.add("nuttella");
        urunler.add("ikram");

        System.out.println(urunler.containsAll(urunler2));





    }
}
