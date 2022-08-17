package ders8;

import java.util.Scanner;

public class C05_NestedIfElse {

    public static void main(String[] args) {
/*Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
 Kullanicidan bir sifre girmesini isteyin
 Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
  Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
 Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
  Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
*/


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sifre giriniz");
        String sifre = scan.next();
        char ilkharf = sifre.charAt(0);
        if (ilkharf >= 'A' && ilkharf <= 'Z') {
            if (ilkharf == 'A') {
                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersis sifre");
            }


        } else if (ilkharf >= 'a' && ilkharf <= 'z') {

            if (ilkharf == 'z') {

                System.out.println("gecerli sifre");
            } else {
                System.out.println("gecersiz sifre");
            }


        } else {
            System.out.println("lutfen ilk karakter icin sadece harf kulanin");
        }


    }
}
