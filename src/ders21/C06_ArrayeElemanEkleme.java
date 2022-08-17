package ders21;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {

    public static void main(String[] args) {

   /*
   05 teki methodu kulanarak araya elemean ekleyelim
    */

        String[] takim = {"suleyman", "osman0"};
        String eklenecekisim = "mustafa";
        takim = C05_ArrayElementEkleme.elemanekle(takim, eklenecekisim);
        System.out.println(Arrays.toString(takim));


    }
}
