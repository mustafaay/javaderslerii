package ders36_inheritanceDataTypeKullanimi;

public class Cmemur extends Bmuhasebe {


    protected int saatucreti = 12;
    protected int gunlukmesai = 9;


    protected void maas() {
        System.out.println("memurlar =  " + (30 * saatucreti * gunlukmesai) + " ucret alir");
    }


    protected void ozelsigorta() {
        System.out.println("memurlar %60 indirimli ozel sigorta yaptirabilirler");
    }


    public static void main(String[] args) {


        Cmemur m1 = new Cmemur();
        System.out.println(m1.gunlukmesai);//9
        System.out.println(m1.saatucreti);//12
        m1.maas();//memurlar =  3240 ucret alir
        m1.ozelsigorta();//memurlar %60 indirimli ozel sigorta yaptirabilirler

        m1.sigirta();//personalden alir
        System.out.println(m1.isim);//personalden alir
        System.out.println(m1.soyisim);//personalden alir
        System.out.println(m1.departman);//personalden alir


        Bmuhasebe b1 = new Bmuhasebe();

        /*
        her ne kadar memur classinin icinde olsakta
        olusturdugumuz obje muhasebe klasindan
        cunku data turu ve controctor Bmuhasebe


        Bmuhasebe de classida obje olusturulabilen bir classtir yani data turudur

         */


        System.out.println(b1.gunlukMesai);//8 muhasebe
        System.out.println(b1.saatUcreti);//10 muhasebe
        b1.maas();//muhasebeden alir
        b1.ozelsigorta();//muhasebeden alir

        b1.sigirta();//personalden alir
        System.out.println(b1.isim);//personalden alir
        System.out.println(b1.soyisim);//personalden alir
        System.out.println(b1.departman);//personalden alir


    }


}
