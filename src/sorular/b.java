package sorular;

public class b {
    public static void main(String[] args) {

        /*
        Array deki sayıları tolpayan Java kodunu yazınız.

array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

Beklenen Çıktı:
Array toplamı: 55
         */


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {


            toplam += arr[i];

        }


        System.out.println("arraydeki sayilarin toplami  =  " + toplam);


    }
}
