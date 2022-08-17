package ders30;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;

public class C03_date {

    public static void main(String[] args) {


        LocalDate tarıh=LocalDate.now();


        System.out.println(   tarıh.getDayOfYear());
        System.out.println(tarıh.getDayOfWeek());
        System.out.println(tarıh.getMonthValue());
        System.out.println(tarıh.isLeapYear());



        LocalDate tarih2=LocalDate.of(2001,05,15);
        System.out.println(tarih2);



LocalDate tarıh3=LocalDate.of(2002, Month.SEPTEMBER,16);


        System.out.println(tarıh3);

        System.out.println(tarıh.plusDays(55));
        System.out.println(tarıh.plusYears(5).plusMonths(3).plusDays(12));


        System.out.println(tarıh.minusWeeks(20));

        System.out.println(tarıh.minusDays(100).minusMonths(5).minusYears(10));

        System.out.println(tarıh.minusYears(2023));
        System.out.println(tarıh.isAfter(tarih2));

/*
iki farkli dogum gunu girildiginde
hangisinde doganin daha buyuk oldugunu giriniz
 */
/*
tarih2 ve tarih3 icin yapalim


 */

if(tarih2.isAfter(tarıh3)){

    System.out.println(tarıh3+"  daha buyuk ");
} else if (tarih2.isBefore(tarıh3)) {
    System.out.println(tarih2+" daha buyu ");

}
else {
    System.out.println( "iki kiside ayni yasta ");
}

    }
}
