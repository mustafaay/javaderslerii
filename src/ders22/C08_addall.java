package ders22;

import java.util.ArrayList;
import java.util.List;

public class C08_addall {


    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<Integer>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(2);

        List<Integer> sayilar2=new ArrayList<Integer>();

        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(16);
        sayilar2.add(20);


        sayilar.addAll(sayilar2);
        System.out.println(sayilar);

        sayilar.addAll(1,sayilar2);

        System.out.println(sayilar);


// bir listenin sonuna veya istedigimiz bir indexine baska bir collection ekliyebiliriz





    }
}
