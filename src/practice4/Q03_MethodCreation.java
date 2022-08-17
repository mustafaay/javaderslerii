package practice4;

import java.util.Scanner;

public class Q03_MethodCreation {
       /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 47 den kucuk pozitif  sayi giriniz");
        int sayi = scan.nextInt();
        fibonaci(sayi);


    }

    private static void fibonaci(int sayi) {

        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;
        System.out.println(sayi1 + "  ");
        System.out.println(sayi2 + "  ");


        if (sayi < 47&&sayi>0) {

            for (int i = 2; i < sayi; i++) {
                sayi3 = sayi1 + sayi2;
                System.out.println(sayi3 + "  ");
                sayi1 = sayi2;
                sayi2 = sayi3;


            }


        } else {
            System.out.println("lutfen 47 den kucuk pozitif  bir sayi giriniz");
        }


    }


}
