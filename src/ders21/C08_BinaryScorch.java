package ders21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_BinaryScorch {

    public static void main(String[] args) {

        /*
        binarys search javada
        eleman aramanin kisa yoludur
        ancak bu komutun calismasi icin onve
        array'in sirali hale gelmesi gerekkir
        eger siralama olmadan kulanirsak sonucu bulamayabilir veya
        yanlis bulabilir
         */

        String[] harfler = {"y", "b", "d", "g", "o"};
Arrays.sort(harfler);
        String arananharf = "y";
        System.out.println(Arrays.toString(harfler));

        System.out.println(Arrays.binarySearch(harfler, arananharf));
// eger array sirali olmazsa
        //arama sonucunu dogru gostermeye bilir
        //emin olmak icin once siralamaliyiz

    }
}
