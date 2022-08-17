package ders35_inheritancetaConstucoctorOlusturma;

public class Mmatamatikciler extends Logretmen {

    Mmatamatikciler() {
        System.out.println("mamatatik parametresiz constroctar");
    }

    Mmatamatikciler(String name) {
        this();
        System.out.println("mamatatik parametreli ");
    }


    public static void main(String[] args) {


        Mmatamatikciler mt = new Mmatamatikciler("mustafa");


    }

/*
this (); constroctar call icinde bulunulan
classtaki constroctar'lari,super constroctar call ise parent classtaki call eder


this veya super parametre yapisina uygun bir constroctar bulamazsa
cte hatasi verir
  o calsstaki instance variebleri refere ediyordu v

constroctar konusunfd agordugumuz this.


 intheritinstada super. vardir ve
 super. parent classtaki instance variableri refer eder

 */
}
