package ders10;

public class C06_indexof {

    public static void main(String[] args) {


        String str1="java ogrenmek cok guzel";
        System.out.println(str1.indexOf("o"));//ekrana 5 yazar .indek olarak geri donus yapar . istersek string  seklinde ("") donus yapar
        System.out.println(str1.indexOf('g'));//ekrana 6 yazar .indek olarak geri donus yapar  , istersek  char seklinde ('') donus yapar



        System.out.println(str1.indexOf("t"));//bana integer dondururu
        //int te yok diye bir deger yok
       //onun yerina bana negatif bir deger yazdirir


        //o dersek jnin indexidir
        //-bir doner donerse biz stingte olmadigini anlariz




    }
}
