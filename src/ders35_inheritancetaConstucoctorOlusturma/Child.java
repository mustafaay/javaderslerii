package ders35_inheritancetaConstucoctorOlusturma;

public class Child extends BParent {
    String isim = "a child isim belirtilmedi ";
    protected String childkulubu = "child kulubu";

    Child() {
        System.out.println("child contractir calisti ");

    }

    public static void main(String[] args) {


        //  a_grantparent gp1=new a_grantparent();


        /*
        bu objeyii olusturmak icin grant pa constactor calisir

        paret veya child constoktor calismaz
         */

        Child ch1 = new Child();
        ch1.grantpakulupadi = "child 1";
        ch1.parentckulubu = "child 2";
/*
ch1 objesi icin Child const calisti
 */

/*
        javada bir classi kulanabilmek icin
         o classtan obje olusturur,dolayisiyla o classin contraktrini kulanirdik


         java inheritens'da parent classlardaki ozelikleri
         kulanabilmek icin
         o classlarin contractorlarini otamatik calistiran bir yapi kurmustur


         orn: biz childd classinda
         childd clasindan bir obje olusturmak istedigimizde child cons. kulaniriz

         java child();
         const. gordugunde once parenter cons.'unu calistirmam lazim der
         buradan parent cont.'a gider
         parent clasinda parent cont.gorunce
         once bunun parentinin yani grantparent'nin cont. calismazi gerekir der
         boylece extends keyword olmayan claasa lkadar girer ve oradan baslayarak tum cont. asagi dogru calistirir

*/


    }

}
