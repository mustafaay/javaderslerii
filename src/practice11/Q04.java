package practice11;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {


// STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
//bunu kart sifre kontrol de de kullabilirinisz
        String str = "mustafacokzeki";
        Scanner scan = new Scanner(System.in);

        int girishakki = 3;


        while (true) {


            System.out.println("sifre gir");
            String sifre2 = scan.next();


            if (str.equals(sifre2)) {

                System.out.println("giris basarili ");
                break;
            } else {
                girishakki--;
                System.out.println("sifre yanlis  " + girishakki + "  giris hakiin kaldi  ");
            }

            if (girishakki == 0) {
                System.out.println("tum giris hakiniz bitti");
                break;
            }


        }


    }
}
