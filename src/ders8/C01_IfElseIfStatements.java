package ders8;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElseIfStatements {

    public static void main(String[] args) {

/*Soru 5) Kullanicidan gun ismini yazmasini isteyin.
 Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
  ilk harf buyuk diger ikisi kucuk olarak yazdirin, gun ismi gecerli
   degilse “Gecerli gun ismi giriniz” yazdirin
 */

        /*   Scanner scan = new Scanner(System.in);
System.out.println("Lutfen bir gun ismi giriniz... :");
String girilenGun = scan.next().toLowerCase();
if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
        || girilenGun.equals("persembe") || girilenGun.equals("cuma") || girilenGun.equals("cumartesi")
        || girilenGun.equals("pazar"))) {
    System.out.println("gecerli bir gun giriniz");
} else {
    String ilkUcHarf = girilenGun.substring(0, 3);
    System.out.println(ilkUcHarf.substring(0, 1).toUpperCase() + ilkUcHarf.substring(1));   */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen haftanin gunlerinden bir tane giriniz");
        String gun = scan.nextLine().toLowerCase(Locale.ROOT);


        if (gun.equals("pazartesi")) {

            System.out.println("PAZ");

        } else if (gun.equals("sali")) {
            System.out.println("SAL");

        } else if (gun.equals("carsanba")) {
            System.out.println("CAR");

        } else if (gun.equals("persenbe")) {
            System.out.println("PER");

        } else if (gun.equals("cuma")) {
            System.out.println("CUM");

        } else if (gun.equals("cumartesi")) {
            System.out.println("CUM");

        } else if (gun.equals("pazar")) {
            System.out.println("PAZ");

        } else {
            System.out.println("lutfen gecerli bir gun giriniz");
        }


    }
}
