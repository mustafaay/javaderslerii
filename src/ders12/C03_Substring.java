package ders12;

public class C03_Substring {

    public static void main(String[] args) {


String isim="suleyman";
String soyisim="karanfil";
String kartno="1234  4567  7890 1254 ";
        System.out.println(isim.substring(3));//eyman
        System.out.println(soyisim.substring(soyisim.length()-3));//fil
        System.out.println(isim.substring(2,5));//ley . burada ilk yazilan ramakami dahil
        //ederek saymaya baslar , den sonraki rakama kadar ama , den sonrki rakami dahil etmez



        //isim ve soy ismin il harfi buyuk diger harfler  * olsun
//kredi kartinin ilk 4 eakami normal diger rakamlar * olsun

String isimilkharf=isim.substring(0,1).toUpperCase();
String isimharf=isim.substring(1).replaceAll("\\w","*");

        String soyilkharf=soyisim.substring(0,1).toUpperCase();
           String soyharf=soyisim.substring(1).replaceAll("\\w","*");

        String kartilkharf=kartno.substring(0,5);
        String kartharf="**** **** **** ";


        System.out.println(isimilkharf+isimharf);
        System.out.println(soyilkharf+soyharf);
        System.out.println(kartilkharf+kartharf);















    }
}
