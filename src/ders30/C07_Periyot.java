package ders30;

import java.time.LocalDate;
import java.time.Period;

public class C07_Periyot {


    public static void main(String[] args) {
       /*
       tarih arasindaki sureyi bulma
        */

        LocalDate tarih=LocalDate.of(2002,9,16);
        LocalDate bugun=LocalDate.now();
        Period priyod= Period.between(bugun,tarih);


        System.out.println(priyod);










    }
}
