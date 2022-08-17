package ders48_maps_thraned;

import ders46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> siniflistmap=ReusableMethods.mapolustur();

        ReusableMethods.entryazdirmethod(siniflistmap);
        System.out.println(siniflistmap.getOrDefault(104, "aradiginiz key yok"));
//derya , deniz , devaps

        System.out.println(siniflistmap.getOrDefault(110, "aradiginiz key yok"));
        //"aradiginiz key yok"

        siniflistmap.putIfAbsent(104,"derya , okyanus , deoloper");
        ReusableMethods.entryazdirmethod(siniflistmap);



        /*
        siniflistesimap'e key olarak  106yoka sa , value " mevlut , han , tester"
         106 daha onceden varsa  eskiden var olan datayi degistirmirmek istedigimizden emin misin yazalim
         106'nin oldugunu kontrol etmet icin contain daha mantikli ama biz
         yeni ogrendigimiz method ile yapalim
*/
if(     siniflistmap.putIfAbsent(104,"derya , okyanus , deoloper")==null){

    System.out.println("kayit basarili");
}
else {
    System.out.println("eski kaydi silmek istedugunuze emin misiniz");
}


siniflistmap.replace(105,"erdal , cifci , tester");
        ReusableMethods.entryazdirmethod(siniflistmap);

        System.out.println(siniflistmap.size());
    }
}
