package ders39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {

    public static void main(String[] args) throws FileNotFoundException {
        /*
        javadan bilgisayarimizdaki bir dosyaya eru=ismek istiyorsak FileInputStream classindan yardim aliriz
        ayni sekilde javadan bilgisayarimizdaki bir dosyaya ekleme yapmak iistersek FileOutputStream clasindan yararlaniriz
         */
        FileInputStream fis=new FileInputStream("src/ders39_exceptions/test.txt");


        /*
        goruldugu gibi ct 'da altini cizen her durum cte degildir
        javada bazi exceptionlar comlite time exception'dur
        ozelikle dosya okuma ve yazma ile ilgili
        exceptionlar comlite time exception'dir



        comlite time exception olustugunda java cozum icin iki ihtimal onerir
        1-)try-cacht ile cevrelemek
        2-)metod signaturene  throws keyword ile beklenen exception turunu yazmak

        throws exception , sadece  olayin farkinda oldugumuzun declarasyonudur
        exception'nin handle edilmesinde hicbir rolu yoktur
        tyani try-cacth ile kontrol altina aldigimiz exception'larda cod calismaya devam ediyordu
        ancak throws exception yazdigimizda java exception ile karsilastiginda hata veriri (hic bir sey yapmamisiz gibi hata mesaji veriri ve calismayi durdurur)

         */









    }


}
