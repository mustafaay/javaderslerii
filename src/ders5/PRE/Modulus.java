package ders5.PRE;

import java.util.Scanner;

public class Modulus {

    public static void main(String[] args) {

        int a,b,c,d,e,f,g,j,toplam;
        Scanner sayi=new Scanner(System.in);
        toplam=0;

        System.out.println("lutfen 4 basamakli tam sayi giriniz");

        a= sayi.nextInt();
        b=a%10;
        c=a/10;

        toplam=toplam+b;

        e=c%10;
        f=c/10;
        toplam=toplam+e;

       g=f%10;
        d=f/10;

        toplam=toplam+g;

        j=d%10;
      e=d/10;

        toplam=toplam+j;

        System.out.println(a+"  sayisinin rakamlar toplmi=  " + toplam);






    }


}
