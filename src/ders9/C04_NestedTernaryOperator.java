package ders9;

import java.util.Scanner;

public class C04_NestedTernaryOperator {

    public static void main(String[] args) {

      //  Soru2 : Kullanicidan bir harf isteyin
        //  kucuk harf ise consola “Kucuk Harf” , buyuk harfse consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
char harf=scan.next().charAt(0);

String sonuc=harf>='a' && harf<='z'? "kucuk harf":
            harf>='A' && harf<='Z'? "buyuk harf":"gecerssiz karakter";

        System.out.println(sonuc);




    }
}
