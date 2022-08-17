package ders20;

public class C01LocalVariables {


    public static void main(String[] args) {
        int sayi=10;
      //  System.out.println(sayimethod); sayimethod method 1 de olusturulmus local variabledir


        for (int i = 0; i < 55; i++) {
            System.out.println(i);
        }
        //System.out.println(i); i loopta olusturulmus local variabledir   sadece lop icersinde kulanilabilir

        //static int sayi = 10; sattic keywor sadece class level de kulanilabilir
        //methodlarin icerisimde static variable tanimlanamaz










    }

    public  static void  method1(){

       //sayi main methoda olusturulmus local bir variablesdir ve sadece main methoda gecerlidir
        // System.out.println(sayi);
       int sayimethod=10;
    }



}
