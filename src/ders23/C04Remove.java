package ders23;

import java.util.ArrayList;
import java.util.List;

public class C04Remove {

    public static void main(String[] args) {


        List<String> urunler=new ArrayList<String>();

        urunler.add("nuttella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");

        /*
        remove methodu iki sekilde kulanilir
        bir objeyi yazip silmesini istersek ize boolean sonuc doner
        iki   indext girersek bu defa o indexteki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler);
        System.out.println(urunler.remove("ikram"));
        System.out.println(urunler);

        System.out.println(urunler.remove("honnt"));
        System.out.println(urunler);



     //ikinci yontem
        System.out.println(  urunler.remove(1));

        System.out.println(urunler);


// olmayan bir inexi silmeya calisirsak


   //    System.out.println(  urunler.remove(5));

   //    System.out.println(urunler);











    }
}
