package practice7;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {

    /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
     *  1. Kullanicidan ismini isteyelim
     *  2. Kullanici adindaki bosluklari silelim.
     *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
     *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
     *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

     */
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();

        isimler.add("enes");
        isimler.add("ismail");
        isimler.add("abdulbaki");
        isimler.add("melisa");
        isimler.add("oguz");
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim=scan.nextLine().trim();

boolean isimvarmi=isimler.contains(isim);

if(isimvarmi      ){

    System.out.println("bu isim var  ");




}
else {
    System.out.println("bu kulanici adi kulanilabilir");
}





if(isimvarmi){

    int rasgele=new Random().nextInt(10000);
    isim=isim+""+rasgele;
    isimler.add(isim);
}
else {
    System.out.println("yeni kulanici adiniz"+isim);
    isimler.add(isim);
}

        System.out.println(isimler);













    }
}
