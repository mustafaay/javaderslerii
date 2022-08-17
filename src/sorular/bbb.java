package sorular;

import java.util.Arrays;

public class bbb {

    public static void main(String[] args) {

        /*
        Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.

Array Elemanları: sari,yesil,mavi,pembe

mavi rengini turuncu ile değiştirelim.

Beklene Çıktı:
[sari,yesil,mavi,pembe]
[sari,yesil,turuncu,pembe]
         */

        String[] arr = {"sari", "yesil", "mavi", "pembe" };

        arr[2] = "turuncu";
        System.out.println(Arrays.toString(arr));


    }
}
