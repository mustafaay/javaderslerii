package ders15;

public class C01_RetrunMethod {

    public static void main(String[] args) {

        //verilen 2 sayiyi carpip
        //sonucu bize donduren bir method  olusturun

        int sayi1 = 25;
        int sayi2 = 4;

        int sonuc = carpimlar(sayi1, sayi2);
        System.out.println(sonuc);

    }

    public static int carpimlar(int sayi1, int sayi2) {


        int cevap = sayi1 * sayi2;
        return cevap;


    }


}
