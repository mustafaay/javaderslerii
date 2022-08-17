package ders22;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

    public static void main(String[] args) {

        /*
        array'i array yapan senbol [] idi
        arraylistde ise <> diomand kulnulir
         */

        List<String> isimler=new ArrayList<>();



        System.out.println(isimler);


/*
bir liste eleman eklemek istersek

 */

isimler.add("mustafa");
        System.out.println(isimler);


/*
String bir method calistirdigimizda
assign yapmazsak String degismiyordu

String isim="suleyman";
isim.tuoppercase;//SULEYMAN bu kalici degildir

sout(isim);//suleyman

 */


        /*
        listin tek kotu tarafi
        array alt yapisi kulandigimiz icin elemanlari
        teker teker eklememiz lazim

         */




    }
}
