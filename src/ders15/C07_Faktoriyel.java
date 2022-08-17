package ders15;

public class C07_Faktoriyel {
    public static void main(String[] args) {

    /*
    input olarak verilen tamsayi icin
    faktoriyel hesaplayip yazdiran
    bir method olusturun

    verilen sayi negatif veya 20 den buyuk olursa
      girilen sayinin faktoriyeli hesaaplanamaz uyarisi yazdirin
     */


        int sayi = 5;

        faktoriyelhesaplama(sayi);


    }

    public static void faktoriyelhesaplama(int sayi) {

        int faktoriyel = 1;


        if (sayi < 0 || sayi > 20) {
            System.out.println("verilen sayi icin faktoriyel hesaplanamaz");
        } else if (sayi == 0) {
            System.out.println("0! = 1 dor");

        } else {

            for (int i = 1; i <= sayi; i++) {
                faktoriyel *= i;
            }

            System.out.println("faktoriyel = " + faktoriyel);


        }

    }


}
