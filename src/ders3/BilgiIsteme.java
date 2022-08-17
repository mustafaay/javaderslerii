package ders3;

import java.util.Scanner;

public class BilgiIsteme {

    public static void main(String[] args) {

        Scanner sacan=new Scanner(System.in);
        System.out.println("adinizi giriniz");
        String sayi1=  sacan.next();
        System.out.println("soyadinizi giriniz");
        String sayi2=  sacan.next();
        System.out.println("yasnizi giriniz ");
        int yas=sacan.nextInt();
        System.out.println("girdiginiz bilgiler =  "+ sayi1+"  "+sayi2+"  "+yas);




    }


}







