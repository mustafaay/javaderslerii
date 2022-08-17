package ders35_inheritancetaConstucoctorOlusturma;

public class Kdizelcorolla extends Hcorolla{


    Kdizelcorolla(){
        System.out.println("kdizelcorolla paarametresiz");
    }


    Kdizelcorolla(String name){
        super(name);
        System.out.println("Kdizelcorolla parametreli ");


    }


    public static void main(String[] args) {

        Kdizelcorolla kd=new Kdizelcorolla("name");


    }

















}
