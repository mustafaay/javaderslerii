package ders10;

public class C05_length {

    public static void main(String[] args) {

        String str="java ogren. isi kap";

        System.out.println(str.length());//str da toplam kac karakter oldugunu verir

        System.out.println(str.charAt(str.length() - 1));//burasi son karakterin indeksini verir
        //charda son karakteri yazdirir


        System.out.println(str.charAt(str.length() -3));//sondan 3. karakteri ekrana yazdirir



        //java da null pointer bir deger degi ,
       // karsisina yazildigi variablenin hic bir deger almadiginin isatercisidir



String str2="";//str2 ye bir deger atanmis midir? EVET
        //bu deger nedir = HICLIK
        //bunu yazdirirsak uzunlugunu 0 olarak verir




String str3=null;//str3 e bir deger atanmis midir ? HAYIR
//NULL bu deger atamayi isater etmektedir
//bunu ekrana yazdirisak hata verir








    }
}
