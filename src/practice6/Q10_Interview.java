package practice6;

import java.util.Scanner;

public class Q10_Interview {
    /*
     * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
     * return eden metod yaziniz
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = scan.nextLine();
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(ilksonharf(str, sayi));


    }

    public static String ilksonharf(String str, int sayi) {
        String tekrar = str.substring(0, 1) + str.substring(str.length() - 1);
        String sonuc = "";
        for (int i = 0; i < sayi; i++) {

          sonuc+=tekrar;

        }


        return sonuc;
    }
}
