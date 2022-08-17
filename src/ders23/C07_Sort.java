package ders23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_Sort {

    public static void main(String[] args) {


        List<String> urunler=new ArrayList<String>();

        urunler.add("nuttella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        Collections.sort(urunler);

        System.out.println(urunler);


/*
list ile gelen sort methodunda siralama ozeligini girmek gerekiyor
bunun terine Collections classindan sort methodunu kulaniyoruz
bu method natural order'a gore siralar
 */






    }
}
