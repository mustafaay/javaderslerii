package ders23;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class C02_Set {

    public static void main(String[] args) {

        /*
        elimizde urunlerin bulundugu bi rliste var
        urun listesindeki istenen siraadaki urunu yenisi ile degistirip

        eski urunu var olan eski urunler listesine ekliyelim


         */

        List<String> urunler=new ArrayList<String>();

        urunler.add("nuttella");
        urunler.add("ikram");
        urunler.add("cekirdek");
        urunler.add("cay");


        List<String> eskiurunler=new ArrayList<String>();

/*
listedeki ikramin yerine biskirem koyalim ikramida eski uruler listesine ekliyelim

 */

String yeniurun="kahve";
String silenecekurun="cay";

int temp=urunler.indexOf(silenecekurun);

String silinenurun=urunler.set(temp,yeniurun);
eskiurunler.add(silinenurun);

        System.out.println(urunler);
        System.out.println(eskiurunler);






    }
}
