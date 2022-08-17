package ders35_inheritancetaConstucoctorOlusturma;

public class Hcorolla extends Gtoyota{


    Hcorolla(){
        System.out.println("corollaz paarametresiz");
    }


    Hcorolla(String name){
        super(name);
        System.out.println("corolla  parametreli ");
    }

}
