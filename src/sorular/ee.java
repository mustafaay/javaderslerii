package sorular;

import java.util.Scanner;

public class ee {

    public static void main(String[] args) {

        /*
        Girilen sayının pozitif, negatif veya sıfır olup olmadığını yazdırın Java Kodunu yazınız.

Test data :21
Beklenen Çıktı:
Sayı Pozitif
Test data :-15
Beklenen Çıktı:
Sayı Negatif

Copied!
Test data :0
Beklenen Çıktı:
Sayı Sıfır
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen herhangi bir sayi giriniz");
        int sayi = scan.nextInt();


        if (sayi > 0) {
            System.out.println(sayi + "  sayisi pozitif sayidir");
        } else if (sayi < 0) {
            System.out.println(sayi + "  sayisi negatif sayidir");
        } else {
            System.out.println(sayi + "  sayisi sifira esittir");
        }


    }
}
