package ders38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        /*
        marketeki tum urunleri bir arrayde tutugumuzu varsayalim
        kulaniciya indext sorup o indexteki urunu yazdiran bir code yazin
         */

        /*
        odev kulanici gecerli bir sey girp hata alamayana kadar kod devam etsin
         */

        String[] urunler = {" ", "nutella", "cokokrem", "sut", "cay", "findik"};

        Scanner scan = new Scanner(System.in);
        int integer = 0;
        try {
            System.out.println("lutfen arratmak istedigiiz intexi giriniz");
            integer = scan.nextInt();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("lutefn 1'dan   " + urunler.length + "'e kadar numaralardan bir tane giriniz");


        }

//
        catch (InputMismatchException e) {
            System.out.println("lutefn 0'dan   " + urunler.length + "'e kadar numaralardan bir tane giriniz");
        }


/*
catch bulogunun onundeki parantezde exception clasinin ismi ve yaninda yakaladigimiz exceptionun'i atadagimiz variable 'in ismi olr (e)
eger yakalanan exception ile ilgili bilgileri vermek istersenin
bu objeyi kulanabilirsiniz
eger exceptian ille ilgili kulaniciya blgi verme ihtiyaci yoksa
e kulanilmasada kod calisir
 */
        System.out.println(urunler[integer]);
    }
}
