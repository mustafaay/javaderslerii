package practice4;

public class Q04_ForLoop {

    /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13       */
    public static void main(String[] args) {
        int a = 0;
        int input = 100;
        int output = 0;
        for (int i = input; i > output; i--) {

            if (i % 13 == 0) {
                a += i;
                System.out.println(i);
            }


        }
        System.out.println("sayilar toplami=  " + a);

    }
}
