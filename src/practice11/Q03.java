package practice11;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


        /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
kontrol edin

Kısaca asal sayılar sadece kendine ve 1'e bölünebilen pozitif tam sayılardır.
1 sayısı ise asal sayı değildir. Çünkü asal sayıların sadece 2 pozitif tam
 sayı böleni olmalıdır.
 1 ise sadece 1'e bölünebildiği için yalnız tek böleni bulunmaktadır.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("luten bir sayi giriniz");
        int sayi = scan.nextInt();
        boolean AsalMi = true;
        if (sayi > 1) {

            for (int i = 2; i < sayi; i++) {

                if (sayi % i == 0) {
                    AsalMi = false;
                    //break;
                }


            }
            if (AsalMi) {
                System.out.println(sayi + "  sayisi asaldir  ");
            } else {
                System.out.println(sayi + " sayisi  asal degildir ");
            }


        } else if (sayi == 1) {
            System.out.println(sayi + "  sayisi asal degildir  ");
        } else {
            System.out.println("  lutfen 1 den buyuk bur sayi giriniz");
        }


    }


}
