package ders34_inheritance;

public class personel {



        /*
        1- Child Classlar parent classlar daki tüm özelliklere sahiptir
2- Child Classlar parent classlardaki bazı özellikleri kendine uyarlayabilir
3- Child classlar parent classlarda olmayan bazı extra özelliklere sahip olabilir.
         */



/*
 *Alican parent classlarının her birinde kendini ifade edebilir.
* ancak personel Alican dediğimizde alt classlara artık bakmayız,
yani personel alican dediysek bunun artık işçi mi beyaz yakalımı o artık beni ilgilendirmiyor
personel Alican dediysem personel özellikleri beni ilgilendiriyor.
 */


/*
eger parent class olacak sekilde tasarladiginiz bir class varsa veya
bu classi paret yapmak isteyenler olabilir diyiyorsaniz variable ve methodlarin
accses modifire'ni protected secmeliyiz
 */
     protected   int personelno;
     protected   String isim="isim belirtilmedi";
     protected   String  departman="departman belirtilmedi";


    protected   void maas(){

            System.out.println("tum personelin maasi vardir");


        }


    protected  void mesai(){

    System.out.println("tum personel statusune gore mesai yapar");

}
    protected  void fazlamesaiucreti(){
            System.out.println("personel fazla mesai ucretini statusune gore alir");
        }

















}
