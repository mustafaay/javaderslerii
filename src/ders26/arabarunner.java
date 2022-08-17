package ders26;

import ders25.C01;
import ders25.car;

public class arabarunner {


    public static void main(String[] args) {

        /*
        bir gun onceki car klasindan obje olusturulalim
         */

        car car1=new car();

        System.out.println(car1.fiyat);

araba araba1=new araba();

        System.out.println("araba1 bilgileri\nMarka : " + araba1.marka +"\nModel : " + araba1.model
                          +"\nYil : " + araba1.yil+ "\nFiyat : " + araba1.fiyat);




        araba araba2=new araba("BMW","5.20",2011,2000);

        System.out.println("araba2 bilgileri\nMarka : " + araba2.marka +"\nModel : " + araba2.model
                +"\nYil : " + araba2.yil+ "\nFiyat : " + araba2.fiyat);

    }
}
