package practice6;

import java.util.Arrays;
import java.util.Scanner;

public class Q08_Arrays {

     /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int a=0;
        int[] sayilar=new int[8];

        for (int j = 0; j < sayilar.length ; j++) {

            System.out.println("lutfen "+j+". elemani giriniz");
            sayilar[j]=scan.nextInt();



            if(sayilar[j]%3==0){

                a++;

            }

        }










        System.out.println("toplamda  "+a+"tane uce bolunen sayi vardir");














    }

}
