package ders45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_set {

    public static void main(String[] args) {

        /*
        verilen bir arraydaki
        tekrar eden elementleri
        silip tekrersin halini arraye atayan
        bi cod yaziniz

         */

        int[] arr = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};
        Set<Integer> tekrarsiz = new HashSet<Integer>();

        for (int e : arr) {
            tekrarsiz.add(e);

        }
        int[] tekrarsizarrr = new int[tekrarsiz.size()];
        int i = 0;
        for (Integer e : tekrarsiz) {
            tekrarsizarrr[i] = e;
            i++;
        }

        System.out.println(Arrays.toString(tekrarsizarrr));
arr=tekrarsizarrr;
        System.out.println(Arrays.toString(arr));










    }
}
