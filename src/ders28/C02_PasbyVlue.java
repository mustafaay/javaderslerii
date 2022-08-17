package ders28;

public class C02_PasbyVlue {


    public static void main(String[] args) {



       double satisfiyti=100;


        System.out.println(indirimlifiyat(satisfiyti));//90
        System.out.println(satisfiyti);
        System.out.println(indirimlifiyat(satisfiyti));
      /*
      iki farkli methoda satisfiyati isminde variable olabilir
      java buna itiraz etmez cunku
      scoplari farklidir
      h
       */

    }


    public static double indirimlifiyat(double orjinalfiyat  ){

        /*
        methodumuz %10 dirim ya[pip yeni fiyati main methoda dondursun
         */
double satisfiyti=orjinalfiyat*0.9;



        return satisfiyti;


    }




}
