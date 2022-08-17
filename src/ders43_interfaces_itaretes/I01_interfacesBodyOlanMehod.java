package ders43_interfaces_itaretes;

public interface I01_interfacesBodyOlanMehod {



    void moto();
    public void yakit();
    public abstract String aku();

/*
normal bir classta oldugumuzu dusunursek
iki tane access modifier kulanma ihtimalimiz yoktur


asagidaki method'da goreceginiz gibi
interfaces'te istisnai olaraka body'si olan methodlar olusturulabilir
bu ozelik java 8 den sonra kulanilmaya baslanilmistir
bir interfaces'e yeni bir method eklememiz gerektiginde  bu ozelikten once
eskiden beri bu interfacesi implement eden tum classlara gidip yeni eklenen methodu override
etmemiz gerekirdi


bu ozelik sayesinde basina default veya static keyword ekleyerek interfaces'te yeni ve body'si olna bir method olusturursak
bu methodun child classlar tarafinadan override edilme
mecburiyeti olmaz
ve eskiden implement etmis classlari degistirmemiz gerekmez

bu istisnai bir durumdur ve interfaces icin olusturulan genel kuralari bizmaz


bu methodlarin bodsi olsada bunlara concrete method denmez
ama override edilme mecburiyetleri yoktur


buradaki default kelimesi access modifire degil istisnai dirumu
belirtilmesi icindir
o zaman  nicin iki keyword yani static ve default tanimlanmistir ?
bu iki farkli kelimenin amaci childd classlardan mu methoda nasil erisilebilecegini
belirlemek icindir
ststic keyword kulanilirsa childd classlardan  u methoda erismek icin
interface adi . method adi yeterli olur

default kelimesini kulanirsak , methoda erismek icin obje olusturulmalidir


 */
public default void teker(){
    System.out.println("bu arabada teker vardir ");
}
public static void direksiyon(){

    System.out.println("tum arabalarin direksiyonu vardir ");

}




}
