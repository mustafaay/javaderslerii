package ders29;

import java.util.ArrayList;
import java.util.List;

public class C03PassByvelua {

    public static void main(String[] args) {

        /*
        bir list olusturalim
        iki methodan birinde
        sadece elemanlari degistirelim

        digerinde yeni bir liste atayip
        ayni sayidan yeni eleman ekleyelim

        ve her iki method call'dan sonra kendi listemizi main
        method icinde kontrol edelim
         */

        List<String> list = new ArrayList<String>();
        list.add("ali");
        list.add("veli");
        list.add("can");

        System.out.println("ilk basta list"+list);

        elemanlaridegisrirme(list);
        System.out.println("methodan sonra mainde "+list);
       elemandegistir(list);

        System.out.println("2.methodan sonra main"+list);
    }

    public static void elemandegistir(List<String> list) {

        list=new ArrayList<>();
        list.add("nutella");
        list.add("cay");
        list.add("cokokrem");


        System.out.println("2.methodta list"+list);





    }

    public static void elemanlaridegisrirme(List<String> list) {
        list.set(0,"oguz");
        list.set(1,"murat");
        list.set(2,"fatih");
        System.out.println("1.methodda list"+list);





    }
}
