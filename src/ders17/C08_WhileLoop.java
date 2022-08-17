package ders17;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
        kulanicidan
        yoplanmak uzere sayilar alin
        sayilarin toplami
        500'u gecince sayilarin tolpamini ve kac sayi toplandigini
        bu sekilde yazdirin
        orn
        15 sayi girdiniz
        toplamda 555
         */
Scanner scan=new Scanner(System.in);
   int tolam=0;
   int sayi=0;
   int a=0;


        while (tolam<500){


            System.out.println("lutfen sayi giriniz");
            sayi=scan.nextInt();
            tolam+=sayi;
            a++;
        }

        System.out.println(a+" tane sayi girdiniz");
        System.out.println("toplamda  "+tolam+" yapti");


    }
}
