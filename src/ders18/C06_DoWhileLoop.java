package ders18;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */


        Scanner scanner = new Scanner(System.in);
int sayi=0;
int pozitifsayi=0;
int negatifsayi=0;


int pozitiftoplam=0;


do {

    System.out.println("lutfen toplamamk uzere pozitif tam sayi firiniz ");
    sayi=scanner.nextInt();


    if (sayi>0){

        pozitiftoplam+=sayi;
        pozitifsayi++;
    } else if (sayi<0) {

        negatifsayi++;
        System.out.println("negatif sayi giremezsiniz");



    }


}while (sayi!=0);

        System.out.println("girilen pozitif sayi adedi = "+pozitifsayi);
        System.out.println("girilen pozitif sayilarin toplami = "+pozitiftoplam);
        System.out.println("girilen negatif sayi adedi = "+negatifsayi);





    }
}
