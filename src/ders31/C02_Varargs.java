package ders31;

public class C02_Varargs {
    public static void main(String[] args) {

       /*
       verilen iki integeri toplayip sonucu yazdiran method ulusturun
        */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        ikisayitopla(sayi1, sayi2,sayi3);


    }

    public static void ikisayitopla(int sayi1, int sayi2 , int sayi3) {

        System.out.println("verilen sayilarin toplami=  " + (sayi1 + sayi2+sayi3));


    }
}
