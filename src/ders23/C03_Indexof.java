package ders23;

import java.util.ArrayList;
import java.util.List;

public class C03_Indexof {

    public static void main(String[] args) {

        List<String> urunler=new ArrayList<String>();

        urunler.add("nuttella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        System.out.println(urunler.indexOf("nuttella"));


/*
indexof methodu bize bilgi donduren bir methotdur listemizi degistirmez


 */
urunler.lastIndexOf("ikram");

        System.out.println(urunler.lastIndexOf("ikram"));


/*
inexof methodu urunu aramaya 0. indexten
last indextof ise aramaya son indexten baslar


arama bitip urun  ulundugunda ikiside bulunan urunun indexini verir
 */










    }
}
