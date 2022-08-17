package ders38_exceptions;

public class C01_Exceptions {

    public static void main(String[] args) {
/*
bir sorunla karsilasmayi beklediginiz noktalarda if else
ile sorun u yakalayip
onunla ilgili cozum uzetebiliriz
ama  sorunu her zaman if else ile cozemeyecegimizden
java try-catch blocklari olusturmustur
 */
      int a=10000;
      int b=500;
int sayac=1;
     while (sayac<1000) {
         if (b == 0) {
             System.out.println("islem yapilirken payda sifir oldu dikat edi iz");
         } else {
             System.out.println(a / b);

         }
         b--;

         sayac++;
     }



























    }
}
