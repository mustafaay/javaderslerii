package sorular;

public class d {

    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

Array = [20, 30, 25, 35, -16, 60, -100 ]

Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
         */

        int[] arr = {20, 30, 25, 35, -16, 60, -100};

        int toplam = 0;
        double ortalama = 0;
        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];


        }

        ortalama = toplam / arr.length;
        System.out.println("arraydeki sayilarin ortalamasi  =  " + ortalama);


    }
}
