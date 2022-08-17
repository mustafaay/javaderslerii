package ders14;

public class C04_MethodCreation {

    public static void main(String[] args) {
        //verilen isim ve soyismi ilk harfi buyuk
        //geriye kalanlari ** olacak sekilde degistirip
        //bize bu halini donduren bir metod olusturun
        //not programin data basende ilerliyen kisimlarinda isim ve soy ismi bu sekilde kulanmak istitoruz


String isim="mustafa";
String soyyisim="ay";

String gizliisim=isimgizle(isim,soyyisim);
        System.out.println(isim+" "+soyyisim);
        System.out.println(gizliisim);




    }

    public static String isimgizle(String isim, String soyyisim) {
        isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyyisim= soyyisim.substring(0,1).toUpperCase()+soyyisim.substring(1).replaceAll("\\w","*");

return isim+" "+soyyisim;

    }


}
