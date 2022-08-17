package dnemeler;

import ders14.C05_MethodCreation;

import java.util.Scanner;

public class dd {

    public static void main(String[] args) {

       /* Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

        Input :

        30

        40

        Beklenen Cikti:
        30 ve 40 icin GCD = 10

        30 ve 40 icin LCM = 120



int ebob=0;
        int sayi1=40;
        int sayi2=30;
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1%i==0&&sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println(sayi1+" ve "+sayi2+" icin GCD = "+ebob);
        int ekok=0;
        int max=sayi1*sayi2;
        for (int i = max; i > 0 ; i--) {
            if (i%sayi1==0&&i%sayi2==0){
                ekok=i;
            }
        }
        System.out.println(sayi1+" ve "+sayi2+" icin LMC = "+ekok);




*/

        Scanner scan = new Scanner(System.in);
        System.out.println("ltfen 1. tam sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("ltfen 2. tam sayiyi giriniz");
        int sayi2 = scan.nextInt();
        int ebob = 0;

        if (sayi1 > sayi2) {
            for (int i = 1; i <= sayi1; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }


        } else if (sayi2 > sayi1) {
            for (int i = 1; i <= sayi2; i++) {
                if (sayi1 % i == 0 && sayi2 % i == 0) {
                    ebob = i;
                }
            }

        }


        System.out.println(sayi1 + " ve " + sayi2 + " icin GCD = " + ebob);
        int ekok = 0;
        int max = sayi1 * sayi2;
        for (int i = max; i > 0; i--) {
            if (i % sayi1 == 0 && i % sayi2 == 0) {
                ekok = i;
            }
        }
        System.out.println(sayi1 + " ve " + sayi2 + " icin LMC = " + ekok);


    }


}
