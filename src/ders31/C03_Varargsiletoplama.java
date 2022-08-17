package ders31;

public class C03_Varargsiletoplama {

    public static void main(String[] args) {

            /*
       verilen kac int olursa olsun  hepsini toplayip sonucu yazdiran method ulusturun
        */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;


        toplayazdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        toplayazdir(sayi1, sayi2, sayi3, sayi4);
        toplayazdir(sayi1, sayi2, sayi3);
        toplayazdir(sayi1, sayi2);


    }


    public static void toplayazdir(int... sayi) {
        int toplam=0;
    for (int a: sayi) {

        toplam+=a;

    }

        System.out.println("toplamlariv = =   "+toplam);
    }


}
