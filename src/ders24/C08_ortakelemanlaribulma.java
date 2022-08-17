package ders24;

import java.util.ArrayList;
import java.util.List;

public class C08_ortakelemanlaribulma {

    public static void main(String[] args) {
/*
Soru 3:
iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
each loop
kullanarak bulunuz. Sonucu ekrana yazdiriniz.
Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
 */


String[] arr1={"ali","veli","can","ayse"};
String[] arr2={"ali","hasan","ayse","enes"};

        List<String> ortakisimler=new ArrayList<String>();

for(String s:arr1){

    for (String s2:arr2) {


        if(s.equalsIgnoreCase(s2)){

            ortakisimler.add(s);

        }

    }




}

       if(ortakisimler.isEmpty()){
           System.out.println("hic ortak eleman yok ");
       }
else {
           System.out.println(" listede  bunlar ortak   =  "+ortakisimler);
       }













    }
}
