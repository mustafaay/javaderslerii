
/*
package practice12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class islemler {

    static List<Kisi> ogretmenlist = new ArrayList<Kisi>();
    static List<Kisi> ogrencilist = new ArrayList<Kisi>();
    static String kisituru;


    static Scanner scan = new Scanner(System.in);


    public static void girispaneli() {

        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");


        String secim = scan.nextLine().toUpperCase();
        switch (secim) {

            case "1":
                kisituru = "OGRENCI";
                islemmenusu();
                break;

            case "2":
                kisituru = "OGRETMEN";
                islemmenusu();
                break;

            case "Q":


                break;

            default:
                System.out.println("hatali giris yaptiniz  liutfen tekrar deneyiniz");
                girispaneli();
                break;


        }


    }

    public static void islemmenusu() {


        System.out.println("sectigin kiso turu  " + kisituru);

        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");


        System.out.println("islem terciginizi giriniz");

        int secilenislem = scan.nextInt();


        switch (secilenislem) {

            case 1:
                ekle();

                islemmenusu();
                break;

            case 2:
                arama();
                girispaneli();
                break;

            case 3:
                listeleme();
                girispaneli();
                break;

            case 4:

                silme();
                girispaneli();

                break;

            case 5:
                girispaneli();

                break;

            case 0:
                cikis();
                break;


            default:
                System.out.println("hatali giris yaptini lutfen gecerli bir sey giriniz");


                girispaneli();
                break;


        }


    }

    public static void cikis() {
    }

    public static void silme() {
    }

    public static void listeleme() {
        System.out.println("***** " + kisituru + " arama   sayfasina hosgeldiniz");
        if (kisituru.equalsIgnoreCase("OGRENCI")){
            System.out.println(ogrencilist);
        }
        else {
            for (Kisi a:ogretmenlist) {

                System.out.println(a.toString());


            }
        }





    }

    public static void arama() {

        boolean flag = true;




        if (kisituru.equalsIgnoreCase("OGRENCI")) {
            System.out.println("lutfen aramak istediginiz kimlik no'sunu giriniz");
            String aranankimlikno = scan.next().replaceAll(" ", "");
            for (Kisi each : ogrencilist
            ) {
                if (each.getKimlikno().equals(aranankimlikno)) {
                    System.out.println("aradiginiz ogrenci " + each.getAdsoyad());
                    flag = false;
                }

            }
            if (flag) {
                System.out.println("aranan ogrenci sistemde mevcut degil");
            }
        }





        else {
            System.out.println("***** " + kisituru + " arama   sayfasina hosgeldiniz");

            System.out.println("lutfen aramak istediginiz kimlik no'sunu giriniz");
            String aranankimlikno = scan.next().replaceAll(" ", "");
            for (Kisi w : ogretmenlist
            ) {
                if (w.getKimlikno().equals(aranankimlikno)) {
                    System.out.println("aradiginiz ogretmen " + w.getAdsoyad());
                    flag = false;
                }

            }
            if (flag) {
                System.out.println("aranan ogretmen sistemde mevcut degil");
            }


        }


    }

    public static void ekle() {

        System.out.println("***** " + kisituru + " ekleme  sayfasina hosgeldiniz");
        System.out.println("isim soyisim giriniz");
        String adsoyad = scan.nextLine();
        scan.nextLine();
        System.out.println("kimlik no giriniz");
        String kimlikno = scan.nextLine();
        System.out.println("yas giriniz");
        int yas = scan.nextInt();

        if (kisituru.equals("OGRENCI")) {


        } else {
            scan.nextLine();
            System.out.println("bolumunuzu giriniz");
            String bolum = scan.nextLine();

            scan.nextLine();
            System.out.println("sicil no giriniz");
            String sicilno = scan.nextLine();


            ogretmen ogretmen = new ogretmen(adsoyad, kimlikno, yas, bolum, sicilno);
            ogretmenlist.add(ogretmen);


        }


    }


}
*/