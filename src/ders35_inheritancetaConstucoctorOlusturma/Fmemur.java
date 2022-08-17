package ders35_inheritancetaConstucoctorOlusturma;

public class Fmemur  extends Emuasebe{
    /*
    extends keyword kulaniln
    classlarda ister default constructor bulunsun
    istersekte biz yeni constructor olusturalim
    java constructor'in ilk satirina
    super(); constructor call yazar


    super constructor call , default constructor'a benzer
    gorunmese ile orada vardir ve calisir
    ancak biz ilk satira farkli bir constructor caal yazarsak
    super (); constructor'ni siler



    eger biz mudahele edip kendi constructor columuzu olusturmazsak
    javanin defaultolarak olusturdugu constructor call her zaman parametresizdir
    super (); constructor call



     */


    Fmemur(){

        System.out.println("memur parametresis calisti ");
    }



    Fmemur(String isim){

        System.out.println("memur parametreli calisti ");
    }


    public static void main(String[] args) {


        Fmemur memur1=new Fmemur();
















    }





}
