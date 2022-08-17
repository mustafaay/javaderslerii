package practice6;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayi girinz");
        int sayi = scan.nextInt();
        basamaktplama(sayi);

        System.out.println(basamaktplama(sayi));
    }

    public static int basamaktplama(int sayi) {

                  int  toplam = 0;


        while (sayi != 0) {

            toplam += sayi % 10;
            sayi = sayi / 10;


        }


        return toplam;

    }


}
