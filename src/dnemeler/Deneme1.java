package dnemeler;

import javax.swing.*;
import java.util.Scanner;

public class Deneme1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen şifrenizi giriniz ");




       long b=scan.nextInt();


    if (b == 123456789) {


        System.out.println("hoşgeldiniz");



}
              if ( ! (b==123456789) ) {
            System.out.println("şifreniz yanlış lütfen tekrar deneyiniz");
         }



    }

}



