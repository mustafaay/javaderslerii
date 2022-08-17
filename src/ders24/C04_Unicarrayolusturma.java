package ders24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Unicarrayolusturma {

    public static void main(String[] args) {

/*
Soru 2) Verilen bir array’deki unique elementleri yeni bir array olarak donduren bir method olusturun
 */

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5,7,7,8,8,9,9,9,10,10,10,10,1,0,10,1,0,54,4,1,4,4};

        int[] uniquearray = uniquearraayolustur(arr);

        System.out.println(Arrays.toString(uniquearray));
    }

    public static int[] uniquearraayolustur(int[] arr) {
        Arrays.sort(arr);

        List<Integer> benzersislist = new ArrayList<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {


            if (arr[i] != arr[i + 1]) {

                benzersislist.add(arr[i]);

            }


        }
        if (!benzersislist.contains(arr[arr.length-1])) {
            benzersislist.add(arr[arr.length-1]);
        }

        int[] tekrersiz = new int[benzersislist.size()];
        for (int i = 0; i < tekrersiz.length; i++) {
            tekrersiz[i] = benzersislist.get(i);


        }


        return tekrersiz;


    }
}
