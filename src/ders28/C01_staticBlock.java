package ders28;

public class C01_staticBlock {

    static int sayi;

    static {
        System.out.println("static block calisti");
        sayi = 10;
/*
statick blavk class uyelerinin tamamindan once
calisir(main nethoddan bile once)

static black class olusturuldugunda calisir
genelikle classla ilgili on ayarlamalar
veya static variablelere deger atamak icin kulanilir

statick blocklarin class icerisinde nerede oldugu onemli degildir
once static blocklar calisir

birden fazla statick block varsa yukaridan asagi dorucalisir


 */


    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);


    }


    static {
        System.out.println("static block 2 calisti");
    }


}
