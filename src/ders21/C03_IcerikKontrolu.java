package ders21;

import java.util.Scanner;

public class C03_IcerikKontrolu {

    public static void main(String[] args) {

/*
Soru 3- Verilen bir array’in
 istenen bir elemani icerip
 icermedigini kontrol edip,
  bize true veya false sonucu donen
   bir method olusturun.
 */

        String[] isimler = {"basak", "nurukah", "fatih", "adem", "enes"};

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen aratmak istediginiz metni giriniz");
        String aranankelime = scan.nextLine();

        boolean sonuc = contians(aranankelime, isimler);


    }

    public static boolean contians(String aranankelime, String[] isimler) {

        boolean sonucMethod = false;
        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(aranankelime)) {
                sonucMethod = true;
            }


        }
        if (sonucMethod) {
            System.out.println("aranan kelime var");
        } else {
            System.out.println("aranan kelime yok");
        }

        return sonucMethod;

    }
}
