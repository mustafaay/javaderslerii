package ders24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Tekraredensayilar {

    public static void main(String[] args) {

//soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};

        Arrays.sort(arr);
        List<Integer> tekraredenler = new ArrayList<Integer>();
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1] && !tekraredenler.contains(arr[i])) {
                tekraredenler.add(arr[i]);


                System.out.println(arr[i] + " tekrar ediyor");
            }


        }


    }
}
