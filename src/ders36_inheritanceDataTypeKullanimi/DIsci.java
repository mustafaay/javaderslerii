package ders36_inheritanceDataTypeKullanimi;

public class DIsci extends  Bmuhasebe {


    protected int saatucreti = 11;
    protected int gunlukmesai = 7;


    protected void maasisci() {
        System.out.println("icsiler =  " + (30 * saatucreti * gunlukmesai) + " ucret alir");
    }


    protected void ozelsigortaisci() {
        System.out.println("isciler %70 indirimli ozel sigorta yaptirabilirler");
    }


    public static void main(String[] args) {

        Bmuhasebe isc1=new DIsci();

/*
bir obje olusturulurken data turu ve constractor ayni claastan isse direk
 o claasa gidiyorduk


 eger data turu ve constractor  farkli ise
 obje constractor'in oldugu cassin objesidir
 ancak bizden istenen
 isci classindaki spesifik ozelikler degil
 bir iscinin muhasebe clasindkai tum calisanlarla bereber sahip oldugu genel ozelikleri istiyoruz
 */


        System.out.println(isc1.gunlukMesai);//8 muhasebe
        System.out.println(isc1.saatUcreti);//10 muhasebeden alir
        isc1.maas();//muhasebe clasindan maas hesaplar
        isc1.ozelsigorta();//muhasebeden hesaplar

        isc1.sigirta();//personalden alir
        System.out.println(isc1.isim);//personalden alir
        System.out.println(isc1.soyisim);//personalden alir
        System.out.println(isc1.departman);//personalden alir



Apersonal icsi2=new DIsci();//


       //System.out.println(icsi2.gunlukMesai);//8 muhasebe
       //System.out.println(icsi2.saatUcreti);//10 muhasebeden alir
        icsi2.maas();//muhasebe clasindan maas hesaplar
     //   icsi2.ozelsigorta();//muhasebeden hesaplar

        icsi2.sigirta();//personalden alir
        System.out.println(icsi2.isim);//personalden alir
        System.out.println(icsi2.soyisim);//personalden alir
        System.out.println(icsi2.departman);//personalden alir
/*
 eger data turu oldugu classta aradigimiz ozelik yoksa
 varsa onum parentine gidebilir ama childe donus olmaz
 aradigi ozeligi bulamazsa cte veriri
 */














    }



























}
