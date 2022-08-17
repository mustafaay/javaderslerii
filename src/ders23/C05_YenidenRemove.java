package ders23;

import java.util.ArrayList;
import java.util.List;

public class C05_YenidenRemove {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);
        System.out.println(sayilar1);


sayilar1.remove(1);
/*
sayilardan olusan bir list varsa
java remove methodunda
sayi yazdigimizda
direk indext olarak kab  eder

 */
        System.out.println(sayilar1);


/*
illada 5 i silsin

 */


        // 1. yontem
Integer sill=5;
sayilar1.remove(sill);
        System.out.println(sayilar1);

//2.yontem

        sayilar1.remove(sayilar1.indexOf(2));

        System.out.println(sayilar1);








    }
}
