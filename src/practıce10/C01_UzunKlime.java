package practıce10;

import java.util.Scanner;

public class C01_UzunKlime {

    public static void main(String[] args) {

        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("1 cumle giriniz");
        String cumle = scan.nextLine();


        System.out.println(enuzunkelimedonduren(cumle));


    }

    public static String enuzunkelimedonduren(String cumle) {

        String[] arr = cumle.split(" ");
        int max = 0;

        String enuzunkelime = "";

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > max) {

                max = arr[i].length();
                enuzunkelime = arr[i];


            }


        }


        return enuzunkelime;


    }
}
