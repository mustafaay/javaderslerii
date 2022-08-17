package ders14;

import java.util.Scanner;

public class C05_MethodCreation {

    public static void main(String[] args) {



        /* Eger bir class'İn icerisinde herhangi bir hesaplama yapip
        bunu da kalici olarak saklamak istersek
kodumuzu sade ve anlasilir tutmak icin
islemi bir method'da yapip
sonucunu main methoda dondurebiliriz
Return type'ı void olmayan bir methodun
 soncunu main method'da bir variable'a atama yaparsa
 k programin geri kalaninda
bu yeni degeri kullanma sansimiz olur

 */


//kulanicidan sehir ismini ve dogum tarihini alip
        //bize progrmda kulanicagimiz formatta bize donduren bir method olusturun
        //sehir ismini programimizda buyuk harf olarak
//tarihi ise 2002-09-16 seklinde kulanmak istiyoruz

        String sehir = sehiral();
        String tarih = tarihal();
        System.out.println("girdiginiz sehir = " + sehir);
        System.out.println("girdiginiz tarih = " + tarih);
    }

    public static String tarihal() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil = scan.nextInt();
        if (yil > 1000 || yil < 9999) {
            tarih = yil + "-";

        } else {
            System.out.println("yil icin gecerli bir yil giriniz");
        }
        System.out.println("lutfen ay giriniz");
        int ay = scan.nextInt();
        if (ay <= 0 || ay > 12) {
            System.out.println("ay no 1-12 araliginda olmalidir");
        } else if (ay < 10) {
            tarih = tarih + "0" + ay + "-";


        } else {
            tarih = tarih + ay + "-";
        }
        System.out.println("lutfen gun giriniz");
        int gun = scan.nextInt();
        if (gun <= 0 || gun > 31) {
            System.out.println("lutfen 1-31 arasi gecerli bir gun giriniz");
        } else if (gun < 10) {
            tarih = tarih + "0" + gun;


        } else {
            tarih = tarih + gun;
        }


        return tarih;


    }

    public static String sehiral() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sehir giriniz");
        String sehiradi = scan.next().toUpperCase();

        return sehiradi;


    }


}
