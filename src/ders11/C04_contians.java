package ders11;

import java.util.Scanner;

public class C04_contians {

    public static void main(String[] args) {

   /*

   kulanicidan bir cumle isteyiniz
   cumle "buyuk" kelimesi iceriyorsa
   tum cumleyi buyuk harf olarrak
   "kucuk"kelimesini iceriyorsa tum cumleyi kucuk yazdiriniz
   kucuk veya buyuk kelimeleri yoksa "cumlede kucuk yada buyuk kelimeleri yok "yazdirinz

cumle.contains("buyuk")

    */

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
cumle=cumle.toLowerCase();
        if(cumle.contains("buyuk")&&cumle.contains("kucuk")){
            System.out.println("karar vermen lazim buyuk mu yazdirayim kucuk mu?");

        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("cumle kucuk veya buyuk kelimeri icermuyor");
        }

    }
}
