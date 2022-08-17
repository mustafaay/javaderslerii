package ders38_exceptions;

public class C02_Exceptions {

    public static void main(String[] args) {



        int a=10000;
        int b=500;
        int sayac=1;
        while (sayac<1000) {
/*
try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak
icin kulanilir

catch'den sonraki parantez karsilasmayi bekledigimiz exception turunu javaya soylemek icin kulanilir

catch blogu : java'ya soyledigimiz exception gerceklesirse java'nin yapmasini istededigimiz islem


catch blogunun onundeki pparanteze karsilasmayi bekledigimiz exception'da girilmesini istiyorsak tum exception
 */
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("hata oldu");
            }

            b--;

            sayac++;
        }








    }
}
