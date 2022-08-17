package practice13;

import java.util.Scanner;

public class Q01 {


    public static void main(String[] args) {

/*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();


        armstrong(sayi);

        sayiyakadar(sayi);


    }

    public static void sayiyakadar(int sayi) {
        for (int i = 1; i <= sayi; i++) {
            armstrong(i);

        }
    }

    public static void armstrong(int sayi) {

        int sayininKuplerToplami = 0;
        int BsamaktakiSayi = 0;
        int GirilenSayi = sayi;

        while ((sayi > 0)) {

            BsamaktakiSayi = sayi % 10;
            sayininKuplerToplami += (BsamaktakiSayi * BsamaktakiSayi * BsamaktakiSayi);
            sayi = sayi / 10;


        }
        if (GirilenSayi == sayininKuplerToplami) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("girilensayi amstrong saydir  " + GirilenSayi);
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        } else {

            System.out.println("girilensayi amstrong saydir degildir     " + GirilenSayi);


        }


    }
}
