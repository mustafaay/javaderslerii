package ders36_inheritanceDataTypeKullanimi;

public class Bmuhasebe extends Apersonal {

    protected  int saatUcreti=10;
    protected int gunlukMesai=8;


    protected void  maas(){

        System.out.println("personel minimum =  "+(30*gunlukMesai*saatUcreti)+"  maas alir");

    }

    protected void ozelsigorta(){
        System.out.println("isteyen calisanlara %50 indirimli ozel sigoerta yapilir");
    }





}
