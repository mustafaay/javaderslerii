package ders42_abstractClass_Interface;

public interface I02_Interfaces {

int SAYI=30;
    /*
    interface bir class degildir

    abstract classlar javada abstraction (soyutlastirma/kura koyma)
     islevini yapiyordu ancak abstract bir classta abstract olmayan
     methodlarda olabilir bu da full abstraction yapmaya izin vermez
     eger javada icinde hic concrete olmasin dedigimiz bir class olusturmak istiyorsaniz
     bunu class degil interface yapmalisiniz

     1-)INTERFACE'lerde concrete method olmaz

     2-)interfaceler full abstraction yapyigindan interfacelerden obje olustuulamaz

hatirladigimiz gibi interface olan listen direk obje olustululamiyorduk
bunun yerine constructor'i lisin child'i olan arraylisten seciyorduk

classlarda 1 child 1 den fazla parent edinemez
ama interface'de 1 child 1 den fazla parent edinebilir

override ederen kimin soylediginin onemi yoktur
 interfaceler neyin yapilmasi gerektigini soyler
 amam nasil yapilacagina karismaz

     */
    public abstract void subtract();
    public static final int a = 12;
}
