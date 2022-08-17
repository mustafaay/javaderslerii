package ders43_interfaces_itaretes;

public class C02_Child implements I01_interfacesBodyOlanMehod{




    @Override
    public void moto() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    parent interfaces'te abstract olan 3 methodi implements etgimizde
    java itirazini durdurur sonradan ekledigimiz
    default veya static keyword ile tanimladigimiz methodlari
    implement etmememiz sorun olusturmadi




    o zaman  nicin iki keyword yani static ve default tanimlanmistir ?
bu iki farkli kelimenin amaci childd classlardan mu methoda nasil erisilebilecegini
belirlemek icindir
ststic keyword kulanilirsa childd classlardan  u methoda erismek icin
interface adi . method adi yeterli olur

     */

    public static void main(String[] args) {
        I01_interfacesBodyOlanMehod.direksiyon();



        C02_Child chd=new  C02_Child();
        chd.teker();



    }








}
