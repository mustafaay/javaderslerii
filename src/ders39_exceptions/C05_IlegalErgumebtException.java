package ders39_exceptions;

import java.util.Scanner;

public class C05_IlegalErgumebtException {


    public static void main(String[] args) {

/*
Soru: Kullanicidan yasini girmesini isteyin.
 Kodunuzu kullanici sifirdan kucuk bir sayi girerse
 Exception verecek sekilde yazin.

 */

        Scanner scan = new Scanner(System.in);
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();


        try {
            if (yas < 0) {
                throw new IllegalArgumentException();
            } else {
                System.out.println(yas);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("yasini duzgun gir len sabahtan beri senle ugrasiyom");

        }


    }
}
