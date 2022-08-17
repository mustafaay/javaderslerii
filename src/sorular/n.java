package sorular;

public class n {

    public static void main(String[] args) {

        /*\
       Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

Array: [1,2,3,4,5,6,7,8,9]

Beklenen Çıktı:
Tek Sayilar: 5
Cift Sayilar: 4

         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int teksayi = 0;
        int ciftsayi = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                ciftsayi++;
            }
            if (arr[i] % 2 == 1) {

                teksayi++;
            }


        }


        System.out.println("arrayde "+teksayi+"  tane tek sayi var");
        System.out.println("arrayde "+ciftsayi+" tane cift sayi var");



    }
}
