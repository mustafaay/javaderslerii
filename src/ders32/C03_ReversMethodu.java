package ders32;

import java.awt.event.MouseAdapter;

public class C03_ReversMethodu {


    public static void main(String[] args) {
        /*
        verilen bir inputu tersine ceviren bir method olusturun
         */

        String input = "heygidi for loop gunleri";

        String terstinpu = tersinecevir(input);


        System.out.println(terstinpu);


    }

    public static String tersinecevir(String input) {

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();


    }
}
