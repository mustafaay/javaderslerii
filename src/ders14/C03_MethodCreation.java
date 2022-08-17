package ders14;

public class C03_MethodCreation {

    public static void main(String[] args) {
   //input olarak verilen isim ve soy ismi
   //ikl harfi buyuk geriye kalan harfler *  olacak sekilde yazdirin
        //M****** A*
        isimgizleme("mustafa","ay");
C02_MethodCreation.rakamlaritopla(997);

    }
    public static void isimgizleme(String isim,String soyyisim){

       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyyisim= soyyisim.substring(0,1).toUpperCase()+soyyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyyisim);
    }








}
