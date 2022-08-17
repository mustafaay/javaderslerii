package ders30;

import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) throws InterruptedException {





        for (int i = 0; i <50 ; i++) {

            LocalTime time1 = LocalTime.now();
            System.out.println(time1);
            Thread.sleep(3000);
            LocalTime time2 = LocalTime.now();
            System.out.println(time2);


        }





        
    }
}
