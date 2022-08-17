package ders8;

import java.util.Locale;
import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {

       /* emeklilik kontrolu yapan bir program yaziniz
                cinsiyet olarak e erkek ve k kadin degiskenlerini kontrol etsin
                farkli bir sey girerse hata versin
                emekliklik icin emeklilik siniri erkeklerde 65 kadinlarda 60
            negatif veya 80 den buyuk sayi girerse hata versin
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        char cinsiyet = scan.next().toLowerCase(Locale.ROOT).charAt(0);
        System.out.println("lutfen yasinzi giriniz");
        int yas = scan.nextInt();



        if (cinsiyet == 'e') {

            if (yas < 0 || yas > 100) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekl olabilirsin");
            }

        } else if (cinsiyet == 'k') {

            if (yas < 0 || yas > 100) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekl olabilirsin");
            }


        } else {


            System.out.println("lutfen gecerli  cinsiyet giriniz");


        }


    }
}
