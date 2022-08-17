package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {

    public static void main(String[] args) {


        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 1. vize notu nuzu giriniz");
        double vize1=scan.nextDouble();
        System.out.println("lutfen 2. vize notu nuzu giriniz");
        double vize2=scan.nextDouble();
        System.out.println("lutfen final notunuzu giriniz");
double Final=scan.nextDouble();

double vizeortalama=(vize1+vize1)/2;

double not=(vizeortalama*0.3)+(Final*0.7);

        System.out.println("not = " + not);





    }
}
