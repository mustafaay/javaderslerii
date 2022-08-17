package ders34_inheritance;

public class isci extends personel {

    int personelno = 1001;

    public static void main(String[] args) {
        /*
        normal hayatimizda parant cocuk saibi olmaya karar verebilir

        javada ise child classlar ozzeliklerini inherit etmek istedikleri classi kendilerine parent edinirler


        mesela isci clasini ousturunca nelere ihtiyaci var
        diye dusunsek persoel classindaki tum
        variabe ve methodlara ihtiyaci oldugunu gorebiliriz
        bu durumda yediden o vairable ve methodlari olusturmak yerine personel clasini kendimize
        parent ediniriz

        bir classi parent edinmek icin ne yapmaliyizextends keywords kulanmaliyiz


        bir class bir classi parent edindiginde
        1-) parent classtaki tum ozeliklere otomatik olarak saip olur
        2-) parent classtaki ozeliklerden bazilarini kendilerine uyarliyabilir
        3-) parent classda olmayan bazi yeni ozeliller olusturabilir
        not: parent classtaki ozeliklerden hicbirini rededemez ama degistirebilir
         */

        isci isci1 = new isci();


        System.out.println(isci1.isim);
        isci1.isim = "selim";
        System.out.println(isci1.personelno);

        isci1.maas();


    }

    public void maas() {

        System.out.println("icciler minimum 15 euro ssat ucreti alir");
    }

    public void ozelsigorta() {
        System.out.println("iscilerden istiyene yuzde 50indirimli sigorta yapilir");

    }


}
