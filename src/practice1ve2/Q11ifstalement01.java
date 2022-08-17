package practice1ve2;

import java.util.Scanner;

public class Q11ifstalement01 {

    public static void main(String[] args) {

        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("y veya n yaziniz");
        String cevap = scan.nextLine().toLowerCase();

        if (cevap.equals("y")) {
            System.out.println("yes");
        } else if (cevap.equals("n")) {
            System.out.println("no");
        } else {
            System.out.println("lutfen y yada n giriniz");
        }

    }
}
