package ders28;

public class C03_pasbyvalue {


    public static void main(String[] args) {
       /*
       %25 indirimli fiyat hesaplayip bize donduren bir method bize dondurun
        */

        double satisfiyati=100;
        double indirimlifiyat=indirimlifiyathesapla(satisfiyati);

        System.out.println(indirimlifiyat);










    }

    public static double indirimlifiyathesapla(double satisfiyati) {

      double indirimlifiyat=satisfiyati*0.75;
      return indirimlifiyat;



    }


}
